package com.asyf.demo.controller;

import com.asyf.demo.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author yjz
 * @Date 2021/8/18 10:17
 */
@RestController
@RequestMapping(value = "/demo")
@Api(tags = "demo示例")
public class DemoController {

    @RequestMapping(value = "test", method = RequestMethod.POST)
    @ApiOperation(value = "接口测试")
    public Object demo() {
        return Result.success(new Date());
    }

}
