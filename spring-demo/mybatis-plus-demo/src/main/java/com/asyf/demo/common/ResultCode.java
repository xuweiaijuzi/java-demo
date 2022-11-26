package com.asyf.demo.common;

/**
 * @Author yjz
 * @Date 2021/8/18 10:42
 */
public enum ResultCode {

    SUCCESS(200, "success"),
    FAIL(500, "fail");

    private final Integer code;
    private final String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
