package com.asyf.demo.service.impl;

import com.asyf.demo.service.LogTraceService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author yjz
 * @Date 2022/7/9 16:16
 */
@Service
@Slf4j
public class LogTraceServiceImpl implements LogTraceService {

    @SneakyThrows
    @Override
    @Async
    public void asyncTest() {
        Thread.sleep(10000);
        log.info("异步接口测试");
    }

}
