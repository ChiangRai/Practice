package com.utils.vo;

import com.constant.Constants;
import com.github.pagehelper.Page;
import com.mybatis.model.BaseEntity;

import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 11:40
 * 分页结果
 */
public class ResponsePageVo<T> {

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 数据List
     */
    private List<? extends Object> rows;


    public ResponsePageVo(long total, List<? extends Object> rows) {
        this.total = total;
        this.rows = rows;
    }

    public ResponsePageVo(int code, String message, long total, List<? extends Object> rows) {
        this.code = code;
        this.message = message;
        this.total = total;
        this.rows = rows;
    }
    public static ResponsePageVo success(Page<? extends BaseEntity> page) {
        return new ResponsePageVo(
                Constants.SUCCESS_CODE, "OK", page.getTotal(), page);
    }

    public static ResponsePageVo failed(String message) {
        return new ResponsePageVo(Constants.FAILD_CODE, message, 0, Collections.emptyList());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<? extends Object> getRows() {
        return rows;
    }

    public void setRows(List<? extends Object> rows) {
        this.rows = rows;
    }
}
