package com.mars.kiwifruit.exception;

public enum ExceptionCode {

    READ_OR_WRITE_FILE_ERROR("10001", "read or write file error"),
    ILLEGAL_ARGUMENT("10002", "illegal argument");

    private String code;
    private String msg;

    ExceptionCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
