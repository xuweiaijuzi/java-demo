package com.asyf.demo.common.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.core.io.ClassPathResource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * POI复制工具类(注意是否同工作簿的差异)
 * POI版本:4.1.1
 * 拷贝数据:sheet,row,cell
 */
@Slf4j
public class PoiCopyUtil {

    /**
     * 参考文章: https://segmentfault.com/a/1190000015284947
     * <p>
     * HSSFWorkbook:是操作Excel2003以前（包括2003）的版本，扩展名是.xls
     * <p>
     * XSSFWorkbook:是操作Excel2007的版本，扩展名是.xlsx
     */
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        FileOutputStream os = null;
        HSSFWorkbook desWb = null;
        HSSFWorkbook srcWb = null;
        try {
            ClassPathResource resource = new ClassPathResource("static/demo.xls");
            is = resource.getInputStream();
            srcWb = new HSSFWorkbook(is);
            //源sheet
            HSSFSheet sheet = srcWb.getSheetAt(0);
            log.info("读取excel文件成功:{}", sheet.getRow(0).getCell(0).getStringCellValue());

            desWb = new HSSFWorkbook();
            List<HSSFCellStyle> styles = cacheStyles(srcWb, desWb);

            //目标sheet
            HSSFSheet sheet1 = desWb.createSheet("sheet1");
            //拷贝sheet
            copySheet(sheet, sheet1, styles);

            //输出文件
            os = new FileOutputStream("D:/" + System.currentTimeMillis() + "a.xls");
            desWb.write(os);

        } finally {
            if (srcWb != null) {
                srcWb.close();
            }
            if (is != null) {
                is.close();
            }
            if (desWb != null) {
                desWb.close();
            }
            if (os != null) {
                os.close();
            }
        }

    }

    /**
     * 缓存样式
     */
    private static List<HSSFCellStyle> cacheStyles(HSSFWorkbook srcWb, HSSFWorkbook desWb) {
        //将多有的style缓存起来，解决style超过4000报错的异常
        int numCellStyles = srcWb.getNumCellStyles();
        log.info("源文件全部的样式数量:{}", numCellStyles);
        List<HSSFCellStyle> styles = new ArrayList<>();
        for (int i = 0; i < numCellStyles; i++) {
            HSSFCellStyle srcCellStyle = srcWb.getCellStyleAt(i);
            //通过index可以直接获取样式,同一个单元格，即：源文件和目标文件使用同一个样式
            //log.info("CellStyle的index:{}", cellStyleAt.getIndex());
            //如果是同一个workBook，样式不用克隆，直接添加即可
            if (srcWb == desWb) {
                styles.add(srcCellStyle);
            } else {
                HSSFCellStyle cellStyle = desWb.createCellStyle();
                cellStyle.cloneStyleFrom(srcCellStyle);
                styles.add(cellStyle);
            }
        }
        return styles;
    }

    /**
     * 赋值sheet
     */
    private static void copySheet(HSSFSheet srcSheet, HSSFSheet desSheet, List<HSSFCellStyle> styles) {

        if (srcSheet.getWorkbook() == desSheet.getWorkbook()) {
            log.warn("统一workbook内复制sheet建议使用 workbook的cloneSheet方法");
        }

        //合并区域处理
        copyMergedRegion(srcSheet, desSheet);

        //复制行
        Iterator<Row> rowIterator = srcSheet.rowIterator();

        int areadlyColunm = 0;
        while (rowIterator.hasNext()) {
            Row srcRow = rowIterator.next();
            Row desRow = desSheet.createRow(srcRow.getRowNum());
            //拷贝行
            copyRow(srcRow, desRow, styles);

            //调整
            short height = srcRow.getHeight();
            //log.info("高度:{}", height);
            desRow.setHeight(height);

            //调整列宽
            if (srcRow.getPhysicalNumberOfCells() > areadlyColunm) {
                for (int i = areadlyColunm; i < srcRow.getPhysicalNumberOfCells(); i++) {
                    //log.info("源文件:列{}宽度{}", i, srcSheet.getColumnWidth(i));
                    desSheet.autoSizeColumn(i);
                    //log.info("目标文件自适应,列{}宽度{}", i, desSheet.getColumnWidth(i));
                    //先设置成自动，再按照比例扩大，和原版还是有区别
                    desSheet.setColumnWidth(i, srcSheet.getColumnWidth(i) * 11 / 10);
                    //log.info("目标文件,列{}宽度{}", i, desSheet.getColumnWidth(i));
                }
                areadlyColunm = srcRow.getPhysicalNumberOfCells();
            }
        }
    }

    /**
     * 复制row
     */
    private static void copyRow(Row srcRow, Row desRow, List<HSSFCellStyle> styles) {
        Iterator<Cell> it = srcRow.cellIterator();
        while (it.hasNext()) {
            Cell srcCell = it.next();
            Cell desCell = desRow.createCell(srcCell.getColumnIndex());
            copyCell(srcCell, desCell, styles);
        }
    }

    /**
     * 复制cell
     */
    public static void copyCell(Cell srcCell, Cell desCell, List<HSSFCellStyle> styles) {
        Workbook srcBook = srcCell.getSheet().getWorkbook();
        Workbook desBook = desCell.getSheet().getWorkbook();

        HSSFCellStyle cellStyle = styles.get(srcCell.getCellStyle().getIndex());
        desCell.setCellStyle(cellStyle);

        //复制批注
        if (srcCell.getCellComment() != null) {
            desCell.setCellComment(srcCell.getCellComment());
        }

        //复制内容
        CellType cellType = srcCell.getCellType();

        switch (cellType) {
            case STRING:
                desCell.setCellValue(srcCell.getStringCellValue());
                break;
            case NUMERIC:
                desCell.setCellValue(srcCell.getNumericCellValue());
                break;
            case FORMULA:
                desCell.setCellFormula(srcCell.getCellFormula());
                break;
            case BOOLEAN:
                desCell.setCellValue(srcCell.getBooleanCellValue());
                break;
            case ERROR:
                desCell.setCellValue(srcCell.getErrorCellValue());
                break;
            case BLANK:
                //nothing to do
                break;
            default:
                break;
        }

    }

    /**
     * 复制区域（合并单元格）
     */
    public static void copyMergedRegion(Sheet srcSheet, Sheet desSheet) {
        int sheetMergerCount = srcSheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergerCount; i++) {
            desSheet.addMergedRegion(srcSheet.getMergedRegion(i));
            //赋值行的时候设置合并，要根据拷贝的起始行和结束行来做
            CellRangeAddress mergedRegion = srcSheet.getMergedRegion(i);
        }
    }

}
