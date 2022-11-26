package com.asyf.demo.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.export.styler.ExcelExportStylerDefaultImpl;
import cn.afterturn.easypoi.handler.inter.ICommentHandler;
import cn.hutool.core.bean.BeanUtil;
import com.asyf.demo.pojo.ExcelDemo;
import com.asyf.demo.pojo.ExcelDemo2;
import com.asyf.demo.pojo.TableInfo;
import com.asyf.demo.service.MyExcelExportService;
import com.asyf.demo.utils.FileUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author yjz
 * @Date 2021/8/16 13:59
 * 官方demo：https://gitee.com/lemur/easypoi-test/commit/ac79b18d00874ef039a7ebf592f94c8eb29a69e7
 */
@RestController
@Api(tags = "easyPoi 测试模块")
@RequestMapping(value = "/easyPoi")
@Slf4j
public class EasyPoiDemoController {


    @RequestMapping(value = "import", method = RequestMethod.POST)
    @ApiOperation(value = "导入测试", notes = "easypoi")
    @ApiImplicitParams({})
    public Object importTest(@RequestParam(value = "file") MultipartFile file,
                             HttpServletResponse response, HttpServletRequest request) throws Exception {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(1);
        List<ExcelDemo> list = ExcelImportUtil.importExcel(file.getInputStream(), ExcelDemo.class, importParams);
        return list;
    }

    @RequestMapping(value = "export", method = RequestMethod.GET)
    @ApiOperation(value = "导出测试", notes = "easypoi")
    @ApiImplicitParams({})
    public void export(HttpServletResponse response, HttpServletRequest request) throws Exception {
        List<ExcelDemo> list = new ArrayList<>();
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("testImg.xls", "UTF-8"));
        response.setCharacterEncoding("UTF-8");
        list.add(new ExcelDemo("1分公司", "2出生周", "3品种", "4特殊代码"));
        ExportParams exportParams = new ExportParams("title", "测试");
        //样式
        exportParams.setStyle(ExcelExportStylerDefaultImpl.class);
        //批注
        exportParams.setCommentHandler(new ICommentHandler() {
            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getComment(String name, Object val) {
                log.info("name{},val{}", name, val);
                //可以将有问题的数据存成存成key val形式 然后判断去加备注
                return "批注" + String.valueOf(val);
            }
        });
        //图片测试
        // 插入图片
        byte[] bytes = FileUtil.getBytesByFile("static/test.png");
        //转出
        //FileUtil.getFileByBytes(bytes, "C:/Users/yangjianzhang/Desktop/", "test2.png");
        //生成工作簿
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams,
                ExcelDemo.class, list);
        try (ServletOutputStream outputStream = response.getOutputStream();) {
            workbook.write(outputStream);
        }
    }


    @RequestMapping(value = "exportPOI", method = RequestMethod.GET)
    @ApiOperation(value = "导出测试-直接使用poi", notes = "批注、背景颜色")
    @ApiImplicitParams({})
    public void exportPOI(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("charset", "UTF-8");//设置类型
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("test.xls", "UTF-8"));
        response.setCharacterEncoding("UTF-8");

        Workbook workbook = null;
        try (ServletOutputStream outputStream = response.getOutputStream();) {
            //获取workbook
            workbook = getWorkbook();
            workbook.write(outputStream);
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
    }

    private Workbook getWorkbook() throws FileNotFoundException {
        //创建工作簿对象
        HSSFWorkbook wb = new HSSFWorkbook();
        //创建工作表对象
        HSSFSheet sheet = wb.createSheet("我的工作表");
        //创建绘图对象
        HSSFPatriarch p = sheet.createDrawingPatriarch();
        //创建单元格对象,批注插入到4行,1列,B5单元格
        HSSFCell cell = sheet.createRow(4).createCell(1);

        //插入单元格内容
        cell.setCellValue(new HSSFRichTextString("批注"));
        //获取批注对象
        //(int dx1, int dy1, int dx2, int dy2, short col1, int row1, short col2, int row2)
        //前四个参数是坐标点,后四个参数是编辑和显示批注时的大小.
        HSSFComment comment = p.createComment(new HSSFClientAnchor(0, 0, 0, 0, (short) 3, 3, (short) 5, 6));
        //输入批注信息
        comment.setString(new HSSFRichTextString("插件批注成功!插件批注成功!"));
        //添加作者,选中B5单元格,看状态栏
        comment.setAuthor("toad");
        //将批注添加到单元格对象中
        cell.setCellComment(comment);

        //设置背景颜色
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cell.setCellStyle(cellStyle);

        //插入图片
        /**
         * 该构造函数有8个参数
         * 前四个参数是控制图片在单元格的位置，分别是图片距离单元格left，top，right，bottom的像素距离
         * 后四个参数，前连个表示图片左上角所在的cellNum和 rowNum，后两个参数对应的表示图片右下角所在的cellNum和 rowNum，
         * excel中的cellNum和rowNum的index都是从0开始的
         */
        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0,
                (short) 3, 5, (short) 6, 21);
        byte[] bytes = FileUtil.getBytesByFile("static/test.png");
        p.createPicture(anchor, wb.addPicture(bytes, HSSFWorkbook.PICTURE_TYPE_JPEG));

        return wb;
    }

    @RequestMapping(value = "import2", method = RequestMethod.POST)
    @ApiOperation(value = "导入后导出excel", notes = "easypoi")
    @ApiImplicitParams({})
    public void importAndExport(@RequestParam(value = "file") MultipartFile file,
                                HttpServletResponse response, HttpServletRequest request) throws Exception {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(1);
        List<TableInfo> list = ExcelImportUtil.importExcel(file.getInputStream(), TableInfo.class, importParams);
        log.info("数据长度：{}", list.size());
        //去重校验
        checkRepeat(list);

        List<TableInfo> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            TableInfo tableInfo = list.get(i);
            tableInfo.setType(tableInfo.getType() + "(" + tableInfo.getLength() + ")");
            tableInfo.setCheck("必填");
            list2.add(tableInfo);
            TableInfo tableInfo1 = new TableInfo();
            BeanUtil.copyProperties(tableInfo, tableInfo1);
            tableInfo1.setCheck("值校验");
            list2.add(tableInfo1);
        }
//        return list2;
        //导出
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("test.xlsx", "UTF-8"));
        response.setCharacterEncoding("UTF-8");
        ExportParams exportParams = new ExportParams("title", "表结构");
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams,
                TableInfo.class, list2);
        try (ServletOutputStream outputStream = response.getOutputStream();) {
            workbook.write(outputStream);
        }
    }

    private void checkRepeat(List<TableInfo> list) {
        List<String> collect = list.stream().map(TableInfo::getField).distinct().collect(Collectors.toList());
        log.info("去重后数据长度:{}", collect.size());
        Map<String, List<TableInfo>> collect1 = list.stream().collect(Collectors.groupingBy(TableInfo::getField));
        collect1.forEach((k, v) -> {
            if (v.size() > 1) {
                log.info("数据重复:key={}", k);
                throw new RuntimeException("数据重复:" + k);
            }
        });
//        if (list.size() != collect.size()) {
//            throw new RuntimeException("数据重复");
//        }
    }


    @RequestMapping(value = "export2", method = RequestMethod.GET)
    @ApiOperation(value = "导出测试", notes = "easypoi中文自动调整列宽")
    @ApiImplicitParams({})
    public void export2(HttpServletResponse response, HttpServletRequest request) throws Exception {
        List<ExcelDemo2> list = new ArrayList<>();
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("test" + System.currentTimeMillis() + ".xls", "UTF-8"));
        response.setCharacterEncoding("UTF-8");
        list.add(new ExcelDemo2("1", "2", "3"));
        //ExportParams exportParams = new ExportParams("title", "测试");
        ExportParams exportParams = new ExportParams();
        //生成工作簿
//        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, ExcelDemo2.class, list);
        Workbook workbook = new HSSFWorkbook();
        (new MyExcelExportService()).createSheet(workbook, exportParams, ExcelDemo2.class, list);
        try (ServletOutputStream outputStream = response.getOutputStream();) {
            workbook.write(outputStream);
        } finally {
            workbook.close();
        }
    }

}
