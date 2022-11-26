package com.asyf.demo.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import sun.font.FontDesignMetrics;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Hashtable;

public class ZxingUtil {

    private static final int HEIGHT = 300;
    private static final int WIDTH = 300;

    /*
     * overlapImage
     * @description：合成二维码和图片为文件
     * @author 李阳
     * @date 2018/12/13
     * @params [backPicPath, code]
     * @return void
     */
    public static final void combineCodeAndPicToFile(String backPicPath, BufferedImage code/*String fillPicPath*/) {
        try {
            BufferedImage big = ImageIO.read(new File(backPicPath));
            BufferedImage small = code;
        /*//合成两个文件时使用
        BufferedImage small = ImageIO.read(new File(fillPicPath));*/
            Graphics2D g = big.createGraphics();
            int height = big.getHeight();
            int width = big.getWidth();
            System.out.println("图片高X宽-" + height + "X" + width);

            //二维码或小图在大图的左上角坐标
//            int x = (big.getWidth() - small.getWidth()) / 2;
            // int y = (big.getHeight() - small.getHeight()) / 2;
//            int y = (big.getHeight() - small.getHeight() - 100);
            int y = 163 + 131 + 43;
            int x = 107 + 43;
//            y = 600;
            g.drawImage(small, x, y, small.getWidth(), small.getHeight(), null);
            //写入文字测试
            writeText(g);

            g.dispose();
            //为了保证大图背景不变色，formatName必须为"png"
            ImageIO.write(big, "png", new File("C:/Users/admin/Desktop/combinePic.jpg"));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeText(Graphics2D g) {
        Font font = new Font("黑体", Font.BOLD, 50);

        g.setFont(font);
        g.setColor(Color.BLACK);
        String content = "001桌";
        int wordWidth = getWordWidth(font, content);
        //图片空白长宽是600 181
        //处理x坐标
        int x = (600 - wordWidth) / 2;
        //处理y坐标
        FontMetrics fm = FontDesignMetrics.getMetrics(font);
        // 高度
        int height = fm.getHeight();
        System.out.println(fm.getHeight());
        // 单个字符宽度
        System.out.println(fm.charWidth('A'));
        // 整个字符串的宽度
        System.out.println(fm.stringWidth(content) + "---" + wordWidth);
        //文字是按照左下角位置  图片是按照左上角位置
        int y = (181 + height) / 2;
        //消除文字锯齿
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        //消除画图锯齿
        //g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawString(content, x, y);

    }

    /**
     * 计算文字的宽度
     * 注意：2中获取宽度的方式都可以使用
     *
     * @param font
     * @param content
     * @return
     */
    public static int getWordWidth(Font font, String content) {
        FontDesignMetrics metrics = FontDesignMetrics.getMetrics(font);
        int width = 0;
        for (int i = 0; i < content.length(); i++) {
            width += metrics.charWidth(content.charAt(i));
        }
        return width;
    }

    /*
     * combineCodeAndPicToInputstream
     * @description：合成二维码和图片为输出流，可用于下载或直接展示
     * @author 李阳
     * @date 2018/12/13
     * @params [backPicPath, code]
     * @return java.io.InputStream
     */
    public static final void combineCodeAndPicToInputstream(String backPicPath, BufferedImage code, HttpServletResponse resp) {
        try {
            BufferedImage big = ImageIO.read(new File(backPicPath));
            // BufferedImage small = ImageIO.read(new File(fillPicPath));
            BufferedImage small = code;
            Graphics2D g = big.createGraphics();

            //二维码或小图在大图的左上角坐标
            int x = (big.getWidth() - small.getWidth()) / 2;
            int y = (big.getHeight() - small.getHeight() - 100);   //二维码距大图下边距100
            g.drawImage(small, x, y, small.getWidth(), small.getHeight(), null);
            g.dispose();
            resp.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("lia阿里.png", "UTF-8"));//去掉这行设置header的代码，前端访问可以直接展示
            //为了保证大图背景不变色，formatName必须为"png"
            ImageIO.write(big, "png", resp.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * combineCodeAndPicToBase64
     * @description：合成二维码和图片为Base64，同样可用于直接展示
     * @author 李阳
     * @date 2018/12/14
     * @params [backPicPath, code]
     * @return java.lang.String
     */
    public static final String combineCodeAndPicToBase64(String backPicPath, BufferedImage code) {
        ImageOutputStream imOut = null;
        try {
            BufferedImage big = ImageIO.read(new File(backPicPath));
            // BufferedImage small = ImageIO.read(new File(fillPicPath));
            BufferedImage small = code;
            Graphics2D g = big.createGraphics();

            //二维码或小图在大图的左上角坐标
            int x = (big.getWidth() - small.getWidth()) / 2;
            int y = (big.getHeight() - small.getHeight() - 100);
            g.drawImage(small, x, y, small.getWidth(), small.getHeight(), null);
            g.dispose();
            //为了保证大图背景不变色，formatName必须为"png"

            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            imOut = ImageIO.createImageOutputStream(bs);
            ImageIO.write(big, "png", imOut);
            InputStream in = new ByteArrayInputStream(bs.toByteArray());

            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            String base64 = Base64.getEncoder().encodeToString(bytes);
            System.out.println(base64);

            return "data:image/jpeg;base64," + base64;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * @return java.awt.image.BufferedImage
     */
    public static BufferedImage createImage(String content, String logoImgPath, boolean needCompress) throws IOException, WriterException {
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        /**
         *分为四个等级：L/M/Q/H, 等级越高，容错率越高，识别速度降低。例如一个角被损坏，容错率高的也许能够识别出来。通常为H
         */
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.MARGIN, 0);
        //200是定义的二维码或小图片的大小
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, 300, 300, hints);
        //调用去除白边方法
//        bitMatrix = deleteWhite(bitMatrix);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //循环遍历每一个像素点
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                boolean flag = false;
                if (x > 95 && y > 95 && x < 205 && y < 205) {
                    flag = true;
                }
                image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
                //中间留空
                flag = false;//关闭logo
                if (flag) {
                    image.setRGB(x, y, 0xFFFFFFFF);
                }
            }
        }
        // 没有logo
        if (logoImgPath == null || "".equals(logoImgPath)) {
            return image;
        }

        // 插入logo
        insertImage(image, logoImgPath, needCompress);
        return image;
    }

    @Deprecated
    private static BitMatrix deleteWhite(BitMatrix matrix) {
        int[] rec = matrix.getEnclosingRectangle();
        int resWidth = rec[2] + 1;
        int resHeight = rec[3] + 1;

        BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
        resMatrix.clear();
        for (int i = 0; i < resWidth; i++) {
            for (int j = 0; j < resHeight; j++) {
                if (matrix.get(i + rec[0], j + rec[1]))
                    resMatrix.set(i, j);
            }
        }
        return resMatrix;
    }

    /*
     * insertImage
     * @description：二维码插入logo
     * @author 李阳
     * @date 2018/12/13
     * @params [source, logoImgPath, needCompress]
     * @return void
     */
    private static void insertImage(BufferedImage source, String logoImgPath, boolean needCompress) throws IOException {
        File file = new File(logoImgPath);
        if (!file.exists()) {
            return;
        }

        Image src = ImageIO.read(new File(logoImgPath));
        int width = src.getWidth(null);
        int height = src.getHeight(null);
        //处理logo
        if (needCompress) {
            if (width > WIDTH) {
                width = WIDTH;
            }

            if (height > HEIGHT) {
                height = HEIGHT;
            }

            Image image = src.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics gMaker = tag.getGraphics();
            gMaker.drawImage(image, 0, 0, null); // 绘制缩小后的图
            gMaker.dispose();
            src = image;
        }

        // 在中心位置插入logo
        Graphics2D graph = source.createGraphics();
        int x = (300 - width) / 2;
        int y = (300 - height) / 2;

        BufferedImage bufferedImage = ImgUtil.setClip(toBufferedImage(src), 30);
        graph.drawImage(bufferedImage, x, y, width, height, null);
        //圆角
        /**
         *前两个指定矩形的左上角的坐标
         * 第3，4个指定矩形的宽度和高度
         * 最后两个指定圆角弧形的宽度和高度
         */
        Shape shape = new RoundRectangle2D.Float(x, y, width, width, 30, 30);
        graph.setStroke(new BasicStroke(3f));
        graph.draw(shape);
        graph.dispose();
    }

    /**
     * Converts a given Image into a BufferedImage
     *
     * @param img The Image to be converted
     * @return The converted BufferedImage
     */

    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        return bimage;

    }

    public static final void main(String[] args) throws IOException, WriterException {
        String logoImgPath = "C:\\Users\\admin\\Desktop\\logo.png";
        logoImgPath = null;
        BufferedImage code = createImage("https://my.oschina.net/kevin2kelly", logoImgPath, false);
        combineCodeAndPicToFile("C:/Users/admin/Desktop/test2.png", code);
//        combineCodeAndPicToBase64("C:/Users/admin/Desktop/无标题.png", code);
    }
}
