package com.asyf.demo.common.pojo;

import com.asyf.demo.common.aop.AsyncMsg;

//请求线程变量
public class RequestHolder {

    private static ThreadLocal<String> content = new ThreadLocal<>();

    public static void set(String req) {
        content.set(req);
    }

    public static String get() {
        return content.get();
    }

    public static void clear() {
        content.set(null);
    }
}
