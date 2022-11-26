package com.asyf.demo.pojo;

import com.asyf.demo.common.serializer.DateDeSerializer;
import com.asyf.demo.common.serializer.DateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class DemoDto2 {

    @JsonDeserialize(using = DateDeSerializer.class)
    @ApiModelProperty(value = "日期1", example = "2021/12/17")
    @JsonSerialize(using = DateSerializer.class)
    private Date date1;

    @JsonDeserialize(using = DateDeSerializer.class)
    @JsonSerialize(using = DateSerializer.class)
    @ApiModelProperty(value = "日期2", example = "2021-12-17")
    private Date date2;

}
