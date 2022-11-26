package com.asyf.demo.pojo;

import com.asyf.demo.common.serializer.DateDeSerializer;
import com.asyf.demo.common.serializer.DateFormatter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author yjz
 * @Date 2021/12/17 16:13
 */
@Data
public class DemoDto3 {

    @ApiModelProperty(value = "日期1", example = "2021/12/17")
    @DateFormatter
    private Date date1;

    @JsonDeserialize(using = DateDeSerializer.class)
    @ApiModelProperty(value = "日期2", example = "2021-12-17")
    @DateFormatter
    private Date date2;

}
