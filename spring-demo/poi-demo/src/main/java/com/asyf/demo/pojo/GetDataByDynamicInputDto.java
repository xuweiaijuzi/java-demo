package com.asyf.demo.pojo;

import lombok.Data;

/**
 * @Author yjz
 * @Date 2022/1/15 8:18
 */
@Data
public class GetDataByDynamicInputDto {

    private int pageSize;//这个是自定义的分页参数，与easypoi分页无关系

    private int pageNum;

    public GetDataByDynamicInputDto() {
        this.pageNum = 1;
        pageSize = 1000;
    }
}
