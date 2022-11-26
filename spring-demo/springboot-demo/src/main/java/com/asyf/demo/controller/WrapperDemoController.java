package com.asyf.demo.controller;

import com.asyf.demo.common.pojo.Result;
import com.asyf.demo.common.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author yjz
 * @Date 2021/8/18 10:17
 * Filter打印请求|返回值（MyWebFilter类）
 */
@RestController
@RequestMapping(value = "/wrapperDemo")
@Api(tags = "Filter打印请求返回值")
@Slf4j
public class WrapperDemoController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ApiOperation(value = "GET测试")
    public Object demo(String id) {
        return Result.success(new Date());
    }

    @RequestMapping(value = "test2", method = RequestMethod.POST)
    @ApiOperation(value = "POST测试")
    public Object test2(@RequestBody User user) {
        user.setAge(18);
        return Result.success(user);
    }

}
