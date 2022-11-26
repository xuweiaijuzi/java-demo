package com.asyf.demo.service;

import com.asyf.demo.common.aop.AsyncMsg;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author yjz
 * @Date 2021/12/30 17:17
 */
public interface AsyncService {

    /**
     * 更新任务进度
     *
     * @param per
     */
    void updateProgress(String per);

    /**
     * 异步执行任务
     *
     * @param asyncMsg
     * @param point
     */
    void async(AsyncMsg asyncMsg, ProceedingJoinPoint point);

    /**
     * 查询任务进度
     *
     * @param id
     * @return
     */
    AsyncMsg findAsyncMsg(String id);

}
