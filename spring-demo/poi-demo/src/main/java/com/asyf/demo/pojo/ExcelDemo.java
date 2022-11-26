package com.asyf.demo.pojo;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

//@ExcelTarget("excelDemo")
@Data
public class ExcelDemo {
    @Excel(name = "ORGCODE")
    private String orgCode;

    @Excel(name = "BIRTHWEEK")
    private String birthWeek;

    @Excel(name = "BREEDER")
    private String breeder;

    @Excel(name = "PRODUCTSPEC")
    private String productSpec;

    @Excel(name = "图片", type = 2, width = 60, height = 60, imageType = 2)
    private byte[] image;

    public ExcelDemo(String orgCode, String birthWeek, String breeder, String productSpec) {
        this.orgCode = orgCode;
        this.birthWeek = birthWeek;
        this.breeder = breeder;
        this.productSpec = productSpec;
    }
}
