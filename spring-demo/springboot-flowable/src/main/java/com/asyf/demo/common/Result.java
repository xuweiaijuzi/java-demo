package com.asyf.demo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;
    private T data;

    public static <T> Result success(T t) {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(t);
        return result;
    }

    public static <T> Result fail(T t) {
        Result result = new Result();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(ResultCode.FAIL.getMsg());
        result.setData(t);
        return result;
    }

    public static <T> Result result(Integer code, String msg, T t) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(t);
        return result;
    }

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

}
