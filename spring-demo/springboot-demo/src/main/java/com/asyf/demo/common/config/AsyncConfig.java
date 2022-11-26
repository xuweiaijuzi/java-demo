package com.asyf.demo.common.config;

import com.asyf.demo.common.util.ThreadPoolExecutorMdcWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.Arrays;
import java.util.concurrent.*;

@Configuration
@EnableAsync(proxyTargetClass = true)
@Slf4j
public class AsyncConfig implements AsyncConfigurer {

    //详细介绍：https://blog.csdn.net/Rain_Butter_fly/article/details/119176734

    @Override
    public Executor getAsyncExecutor() {
        //方式一：
        //支持MDC的traceId
        ExecutorService executorService = new ThreadPoolExecutorMdcWrapper(10, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        //方式二：
        //使用自定义的ThreadFactory以支持自定义线程名：CustomizableThreadFactory
        //注意：这种方式可能会导致内存溢出，因为quque没有设置最大值
        ThreadPoolExecutor executor = new ThreadPoolExecutorMdcWrapper(1, 3,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(2), new CustomizableThreadFactory("myTask-"));
        //请求10次接口，会有5次拒绝
//        executor.setRejectedExecutionHandler((r, e) -> {
//            throw new RejectedExecutionException("Task " + r.toString() +
//                    " rejected from " +
//                    e.toString());
//        });
        return executor;

        //方式三：
        //spring封装的执行器 - 不能支持traceId
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(10);
//        executor.setMaxPoolSize(20);
//        executor.setQueueCapacity(1000);
//        executor.setThreadNamePrefix("MyExecutor-");
//        executor.setWaitForTasksToCompleteOnShutdown(false);
//        // 设置拒绝策略
//        executor.setRejectedExecutionHandler((r, e) -> {
//            throw new RejectedExecutionException("Task " + r.toString() +
//                    " rejected from " +
//                    e.toString());
//        });
//        executor.initialize();
//        return executor;

        //方式四：
//        ThreadPoolTaskExecutor executor = MdcThreadPoolTaskExecutor.newWithInheritedMdc(8, 32, 1, TimeUnit.MINUTES, 1000);
//        executor.setThreadNamePrefix("MyExecutor-");
//        executor.setMaxPoolSize(10);
//        executor.setMaxPoolSize(20);
//        executor.setQueueCapacity(1000);
//        executor.initialize();
//
//        return executor;

    }


    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        //return new SimpleAsyncUncaughtExceptionHandler();
        return (ex, method, params) ->
                log.error("Unexpected error occurred invoking async method: " + method +
                        ", args: " + Arrays.toString(params), ex);
    }

}

