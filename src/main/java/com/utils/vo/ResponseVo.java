package com.utils.vo;

import com.constant.Constants;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 14:48
 */
public class ResponseVo {

    private int code;

    private String message;

    private Object data;

    public ResponseVo() {
    }

    public ResponseVo(int code) {
        this.code = code;
    }

    public static ResponseVo instance() {
        return new ResponseVo();
    }

    public static ResponseVo success(String message) {
        return new ResponseVo(Constants.SUCCESS_CODE, message);
    }

    public static ResponseVo success(String message, Object data) {
        return new ResponseVo(Constants.SUCCESS_CODE, message, data);
    }

    public static ResponseVo failed(String message) {
        return new ResponseVo(Constants.FAILD_CODE, message);
    }

    public static ResponseVo failed(String message, Object data) {
        return new ResponseVo(Constants.FAILD_CODE, message, data);
    }

    public static ResponseVo set(int code, String message) {
        return new ResponseVo(code, message);
    }

    public static ResponseVo set(int code, String message, Object data) {
        return new ResponseVo(code, message, data);
    }

    public ResponseVo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseVo(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public ResponseVo setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseVo setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
