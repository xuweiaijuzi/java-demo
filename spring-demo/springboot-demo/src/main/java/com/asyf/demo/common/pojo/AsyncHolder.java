package com.asyf.demo.common.pojo;

import com.asyf.demo.common.aop.AsyncMsg;

//记录异步消息使用
public class AsyncHolder {
    private static ThreadLocal<AsyncMsg> content = new ThreadLocal<>();

    public static void set(AsyncMsg req) {
        content.set(req);
    }

    public static AsyncMsg get() {
        return content.get();
    }

    //在开发web项目中，使用ThreadLocal在一个线程中存储了一个变量x时，
    // 如果你没有在get()后进行clear()操作：那么当你再次从线程池中拿
    // 到这个线程时，这个线程对象仍然保存有变量x。
    public static void clear() {
        content.set(null);
    }
}
