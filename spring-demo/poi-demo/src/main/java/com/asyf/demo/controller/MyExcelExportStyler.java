package com.asyf.demo.controller;

import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.afterturn.easypoi.excel.entity.params.ExcelForEachParams;
import cn.afterturn.easypoi.excel.export.styler.IExcelExportStyler;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;

import java.lang.reflect.Method;

/**
 * @Author yjz
 * @Date 2021/9/27 10:37
 */
@Slf4j
public class MyExcelExportStyler implements IExcelExportStyler {

    private Workbook workbook;

    public MyExcelExportStyler(Workbook workbook) {
        this.init(workbook);
    }

    /**
     * 初始化样式
     *
     * @param workbook
     */
    private void init(Workbook workbook) {
        this.workbook = workbook;
//        this.headerStyle = initHeaderStyle(workbook);
//        this.titleStyle = initTitleStyle(workbook);
//        this.styles = initStyles(workbook);
    }

    @Override
    public CellStyle getHeaderStyle(short i) {
        log.info("执行 getHeaderStyle");
        return null;
    }

    @Override
    public CellStyle getTitleStyle(short i) {
        log.info("执行 getTitleStyle");
        return null;
    }

    @Override
    public CellStyle getStyles(boolean b, ExcelExportEntity excelExportEntity) {
        log.info("执行 getStyles 2");
        CellStyle style = getBaseCellStyle(workbook);
//        String enumExportField = excelExportEntity.getEnumExportField();
//        String name = excelExportEntity.getName();
//        Method method = excelExportEntity.getMethod();

        return null;
    }

    @Override
    public CellStyle getStyles(Cell cell, int i, ExcelExportEntity excelExportEntity, Object o, Object o1) {
        log.info("执行 getStyles 5");
        return null;
    }

    @Override
    public CellStyle getTemplateStyles(boolean b, ExcelForEachParams excelForEachParams) {
        log.info("执行 getTemplateStyles");
        return null;
    }

    /**
     * 基础样式
     *
     * @return
     */
    private CellStyle getBaseCellStyle(Workbook workbook) {
        CellStyle style = workbook.createCellStyle();
        //下边框
        style.setBorderBottom(BorderStyle.THIN);
        //左边框
        style.setBorderLeft(BorderStyle.THIN);
        //上边框
        style.setBorderTop(BorderStyle.THIN);
        //右边框
        style.setBorderRight(BorderStyle.THIN);
        //水平居中
        style.setAlignment(HorizontalAlignment.CENTER);
        //上下居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //设置自动换行
        style.setWrapText(true);
        return style;
    }

}
