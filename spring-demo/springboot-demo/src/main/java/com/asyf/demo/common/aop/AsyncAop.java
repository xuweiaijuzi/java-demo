package com.asyf.demo.common.aop;

import cn.hutool.core.util.IdUtil;
import com.asyf.demo.common.pojo.Result;
import com.asyf.demo.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Slf4j
public class AsyncAop {

    @Autowired
    private AsyncService asyncService;

    @Pointcut("@annotation(com.asyf.demo.common.aop.EnableAsync)")
    public void asyncPointCut() {
    }

    @Around("asyncPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //请求header
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        //异步消息
        String id = IdUtil.simpleUUID();
        AsyncMsg asyncMsg = new AsyncMsg();
        asyncMsg.setId(id);
        //异步返回值
        Object result = Result.success(asyncMsg);

        //异步执行
        asyncService.async(asyncMsg, point);

        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        logCostTime(point, time);

        return result;
    }


    private void logCostTime(ProceedingJoinPoint point, long time) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();
        log.info("class:{} method:{} 耗时:{}ms", className, methodName, time);
    }
}
