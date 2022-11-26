package com.asyf.demo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

//@ExcelTarget("excelDemo")
@Data
public class ExcelDemo2 {
    @Excel(name = "一")
    private String name;

    @Excel(name = "二三四")
    private String age;

    @Excel(name = "五六七八五六七八五六七八五六七八")
    private String email;

    public ExcelDemo2(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

}
