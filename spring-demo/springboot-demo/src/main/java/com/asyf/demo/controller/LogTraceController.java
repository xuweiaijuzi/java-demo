package com.asyf.demo.controller;

import com.asyf.demo.common.pojo.Result;
import com.asyf.demo.common.util.ThreadPoolExecutorMdcWrapper;
import com.asyf.demo.service.LogTraceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author yjz
 * @Date 2021/2/18 8:56
 */
@RestController
@RequestMapping(value = "logTest")
@Api(tags = "日志traceId测试")
@Slf4j
public class LogTraceController {

    @Autowired
    private LogTraceService logTraceService;

    @ApiOperation(value = "测试")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public Object exportTest(HttpServletRequest request, HttpServletResponse response, Integer num) throws Exception {
        log.info("查询结果：{}", "1");
        if (num != null) {
            Thread.sleep(num * 1000);
        }
        //测试线程池
        //改方法等同于 ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService = new ThreadPoolExecutorMdcWrapper(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        executorService.submit(() -> {
            log.info("线程池内打印日志");
        });
        executorService.shutdown();
        return new Date().toString() + " - ";
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    @ApiOperation(value = "异步接口traceId")
    public Object demo2() {
        logTraceService.asyncTest();
        return Result.success(new Date());
    }

}
