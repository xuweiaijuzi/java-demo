package com.asyf.demo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author yjz
 * @Date 2021/9/28 10:14
 */
@Data
public class TableInfo {

    @Excel(name = "类型", mergeVertical = true)
    private String fieldType;

    @Excel(name = "字段", mergeVertical = true)
    private String field;

    @Excel(name = "字段类型", mergeVertical = true)
    private String type;

    @Excel(name = "备注", mergeVertical = true)
    private String comment;

    @Excel(name = "长度", mergeVertical = true)
    private String length;

    @Excel(name = "校验", mergeVertical = true)
    private String check;
}
