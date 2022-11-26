package com.asyf.demo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

//@ExcelTarget("excelDemo")
@Data
public class DateDemo {

    @Excel(name = "日期", format = "yyyy/MM/dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date date;

}
