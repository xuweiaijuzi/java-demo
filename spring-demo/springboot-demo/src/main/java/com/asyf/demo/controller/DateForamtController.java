package com.asyf.demo.controller;

import cn.hutool.json.JSONUtil;
import com.asyf.demo.common.pojo.Result;
import com.asyf.demo.pojo.DemoDto;
import com.asyf.demo.pojo.DemoDto2;
import com.asyf.demo.pojo.DemoDto3;
import com.asyf.demo.pojo.DemoDto4;
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
 */
@RestController
@RequestMapping(value = "/dateDemo")
@Api(tags = "Jackson自定义序列化&反序列化")
@Slf4j
public class DateForamtController {

    @RequestMapping(value = "test", method = RequestMethod.POST)
    @ApiOperation(value = "接口测试")
    public Object demo() {
        return Result.success(new Date());
    }

    @RequestMapping(value = "dateDemo", method = RequestMethod.POST)
    @ApiOperation(value = "日期转换测试-反序列化")
    public Object dateDemo(@RequestBody DemoDto demoDto) {
        log.info(demoDto.toString());
        return Result.success(demoDto);
    }

    @RequestMapping(value = "dateDemo2", method = RequestMethod.POST)
    @ApiOperation(value = "日期转换测试-序列化")
    public Result<?> dateDemo2(@RequestBody DemoDto2 demoDto2) {
        log.info("请求值:{}", demoDto2.toString());
        return Result.success(demoDto2);
    }

    @RequestMapping(value = "dateDemo3", method = RequestMethod.POST)
    @ApiOperation(value = "日期转换测试-序列化(自定义注解)")
    public Result<?> dateDemo3() {
        DemoDto3 demoDto3 = new DemoDto3();
        Date date = new Date();
        demoDto3.setDate1(date);
        demoDto3.setDate2(date);
        return Result.success(demoDto3);
    }

    @RequestMapping(value = "dateDemo4", method = RequestMethod.POST)
    @ApiOperation(value = "日期转换测试-反序列化(自定义注解)")
    public Result<?> dateDemo4(@RequestBody DemoDto4 demoDto4) {
        log.info(JSONUtil.toJsonStr(demoDto4));
        return Result.success(demoDto4);
    }

}
