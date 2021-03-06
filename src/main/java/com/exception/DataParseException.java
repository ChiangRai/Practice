package com.exception;


import com.enums.HttpCode;

public class DataParseException extends BaseException {

    public DataParseException() {
    }

    public DataParseException(Throwable ex) {
        super(ex);
    }

    public DataParseException(String message) {
        super(message);
    }

    public DataParseException(String message, Throwable ex) {
        super(message, ex);
    }

    protected HttpCode getHttpCode() {
        return HttpCode.INTERNAL_SERVER_ERROR;
    }

}
