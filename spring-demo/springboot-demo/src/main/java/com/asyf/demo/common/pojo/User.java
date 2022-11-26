package com.asyf.demo.common.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author yjz
 * @Date 2022/4/2 13:36
 */
@Data
public class User {

    @ApiModelProperty(value = "id", example = "1")
    private String id;

    @ApiModelProperty(value = "名称", example = "小明")
    private String name;

    @ApiModelProperty(value = "年龄", example = "26")
    private Integer age;
}
