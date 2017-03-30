package com.constant;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 11:47
 * 常量
 */
public interface Constants {
     /**
     * 异常信息统一头信息<br>
     * 非常遗憾的通知您,程序发生了异常
     */
    String EXCEPTION_HEAD = "OH,MY GOD! SOME ERRORS OCCURED! AS FOLLOWS :";
    /**
     * 客户端语言
     */
    String USER_LANGUAGE = "userLanguage";
    /**
     * 客户端主题
     */
    String WEB_THEME = "webTheme";
    /**
     * 当前用户
     */
    String CURRENT_USER = "CURRENT_USER";
    /**
     * 在线用户数量
     */
    String ALL_USER_NUMBER = "ALL_USER_NUMBER";
    /**
     * 登录用户数量
     */
    String USER_NUMBER = "USER_NUMBER";
    /**
     * 上次请求地址
     */
    String PRE_REQUEST = "PRE_REQUEST";
    /**
     * 上次请求时间
     */
    String PRE_REQUEST_TIME = "PRE_REQUEST_TIME";
    /**
     * 非法请求次数
     */
    String MALICIOUS_REQUEST_TIMES = "MALICIOUS_REQUEST_TIMES";
    /**
     * 缓存命名空间
     */
    String CACHE_NAMESPACE = "CACHE_PROJECT";

    /**
     * ok code
     */
    Integer SUCCESS_CODE = 1;

    /**
     * faild code
     */
    Integer FAILD_CODE = 0;
}
