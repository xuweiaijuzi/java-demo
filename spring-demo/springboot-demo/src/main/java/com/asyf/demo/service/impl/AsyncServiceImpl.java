package com.asyf.demo.service.impl;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.asyf.demo.common.aop.AsyncMsg;
import com.asyf.demo.common.pojo.AsyncHolder;
import com.asyf.demo.common.pojo.RequestHolder;
import com.asyf.demo.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void async(AsyncMsg asyncMsg, ProceedingJoinPoint point) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String id = asyncMsg.getId();
                //异步消息线程变量-传送id到实际方法以便方法更新进度
                AsyncHolder.set(asyncMsg);
                //执行方法
                try {
                    redisTemplate.opsForValue().set(id, asyncMsg, 60, TimeUnit.MINUTES);
                    Object result = point.proceed();
                    asyncMsg.setResult(result);
                    asyncMsg.setStatus("0");
                    redisTemplate.opsForValue().set(id, asyncMsg, 60, TimeUnit.MINUTES);
                } catch (Throwable throwable) {
                    log.error(ExceptionUtil.stacktraceToString(throwable));
                    asyncMsg.setStatus("-1");
                    asyncMsg.setResult(throwable.getLocalizedMessage());
                    redisTemplate.opsForValue().set(id, asyncMsg, 60, TimeUnit.MINUTES);
                } finally {
                    AsyncHolder.clear();
                }
            }
        }).start();
    }

    @Override
    public void updateProgress(String per) {
        AsyncMsg asyncMsg = AsyncHolder.get();
        asyncMsg.setProgress(per);
        redisTemplate.opsForValue().set(asyncMsg.getId(), asyncMsg, 60, TimeUnit.MINUTES);
    }

    @Override
    public AsyncMsg findAsyncMsg(String id) {
        AsyncMsg asyncMsg = (AsyncMsg) redisTemplate.opsForValue().get(id);
        return asyncMsg;
    }
}
