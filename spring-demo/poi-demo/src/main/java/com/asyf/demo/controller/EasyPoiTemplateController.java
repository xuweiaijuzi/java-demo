package com.asyf.demo.controller;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.afterturn.easypoi.util.PoiExcelGraphDataUtil;
import com.asyf.demo.utils.ZxingUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yjz
 * @Date 2021/8/16 13:59
 * 参考：https://blog.csdn.net/u012441819/article/details/96828044
 * <p>
 * 文档地址：http://doc.wupaas.com/docs/easypoi/easypoi-1c0u6ksp2r091
 * <p>
 * HSSF是POI工程对Excel 97(-2007) (.xls)
 * XSSF是POI工程对Excel 2007 OOXML (.xlsx)
 */
@RestController
@Api(tags = "easyPoi模板功能测试")
@RequestMapping(value = "/easyPoiTemplate")
@Slf4j
public class EasyPoiTemplateController {


    @RequestMapping(value = "export", method = RequestMethod.GET)
    @ApiOperation(value = "模板导出测试")
    @ApiImplicitParams({})
    public void importTest(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("test+" + System.currentTimeMillis() + ".xlsx", "UTF-8"));
        response.setCharacterEncoding("UTF-8");

        //模板参数
        TemplateExportParams params = new TemplateExportParams("templates/template.xlsx");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "李四");
        List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
        for (int i = 0; i < 4; i++) {
            Map<String, String> lm = new HashMap<String, String>();
            lm.put("id", i + 1 + "");
            lm.put("num", i + "");
            lm.put("email", i + "@email");
            listMap.add(lm);
        }
        map.put("maplist", listMap);

        //图片
        BufferedImage image = ZxingUtil.createImage("123qwe", "", false);
        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOut);

        //创建图片对象
        ImageEntity imageEntity = new ImageEntity(byteArrayOut.toByteArray(), 300, 300);

        //设置这个才能让图片显示出来，但是会默认合并了单元格
        imageEntity.setRowspan(2);
        imageEntity.setColspan(2);
        map.put("barcode", imageEntity);

        Workbook workbook = ExcelExportUtil.exportExcel(params, map);

        //手动画图片测试
        //drawPicTest(workbook, byteArrayOut);

        workbook.write(response.getOutputStream());
        workbook.close();
    }

    private void drawPicTest(Workbook workbook, ByteArrayOutputStream byteArrayOut) {
        Sheet sheet = workbook.getSheetAt(0);
        Drawing p = PoiExcelGraphDataUtil.getDrawingPatriarch(sheet);
        XSSFClientAnchor anchor = new XSSFClientAnchor(10, 10, 1010, 245,
                (short) 1, 1, (short) 2, 2); //后4个参数不能为空
        p.createPicture((ClientAnchor) anchor, workbook.addPicture(byteArrayOut.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));

    }

}
