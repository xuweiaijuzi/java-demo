package com.asyf.demo.service;

import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.afterturn.easypoi.excel.export.ExcelExportService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;

/**
 * @Author yjz 重写设置宽度的代码，以便方便到处中文的自动列宽
 * @Date 2021/11/10 16:14
 */
@Slf4j
public class MyExcelExportService extends ExcelExportService {

    @Override
    public void setCellWith(List<ExcelExportEntity> excelParams, Sheet sheet) {
        for (int i = 0; i < excelParams.size(); i++) {
            ExcelExportEntity entity = excelParams.get(i);
            String name = entity.getName();
            log.info("列名称:{},列宽:{},当前列宽:{}", name, name.getBytes().length * 2 * 256, sheet.getColumnWidth(i));
//            sheet.setColumnWidth(i, name.getBytes().length * 2 * 256 * 2);
            //entity.setWidth(name.length() * (10D / 3D));
            entity.setWidth(name.length() * 2.00D);
            log.info("width:{}", entity.getWidth());
            //sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
            //log.info("列名称:{},当前列宽:{}", name, sheet.getColumnWidth(i));
//            if (excelParams.get(i).getList() != null) {
//                List<ExcelExportEntity> list = excelParams.get(i).getList();
//                for (int j = 0; j < list.size(); j++) {
//                    // 调整每一列宽度
//                    sheet.autoSizeColumn((short) i);
//                    // 解决自动设置列宽中文失效的问题
//                    sheet.setColumnWidth(i, sheet.getColumnWidth(j) * 17 / 10);
//                }
//            } else {
//                // 调整每一列宽度
//                sheet.autoSizeColumn((short) i);
//                // 解决自动设置列宽中文失效的问题
//                //sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
//                sheet.setColumnWidth(i, 100 * 256);
//            }
        }
        super.setCellWith(excelParams, sheet);
    }
}
