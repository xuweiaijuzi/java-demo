package com.asyf.demo.controller;

import com.asyf.demo.common.pojo.Result;
import com.asyf.demo.common.aop.AsyncMsg;
import com.asyf.demo.common.aop.EnableAsync;
import com.asyf.demo.service.AsyncService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * springboot使用aop实现接口异步(进度条)
 */
@RestController
@RequestMapping(value = "/async")
@Api(tags = "接口异步示例")
@Slf4j
public class AsyncController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private AsyncService asyncService;

    @EnableAsync
    @RequestMapping(value = "test", method = RequestMethod.POST)
    @ApiOperation(value = "接口测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "num", value = "数字", required = true, dataType = "int", paramType = "query", defaultValue = "1")
    })
    public Object demo(Integer num) throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            //计算百分比
            String per = BigDecimal.valueOf(i).divide(BigDecimal.valueOf(15), 2, RoundingMode.HALF_DOWN).toString();
            //更新redis缓存任务进度
            asyncService.updateProgress(per);
        }
        Integer b = 100;
        return Result.success(String.format("100除以%s的结果是%s", num, b / num));
    }

    @RequestMapping(value = "findAsyncMsg", method = RequestMethod.POST)
    @ApiOperation(value = "查询异步接口消息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "string", paramType = "query", defaultValue = "")
    })
    public Result<AsyncMsg> findAsyncMsg(String id) throws InterruptedException {
        AsyncMsg asyncMsg = asyncService.findAsyncMsg(id);
        return Result.success(asyncMsg);
    }

}
