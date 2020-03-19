package com.mars.kiwifruit.exception;

public class MyException extends RuntimeException {

    private ExceptionCode exceptionCode;

    public MyException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMsg());
        this.exceptionCode = exceptionCode;
    }

    public MyException(ExceptionCode exceptionCode, String exceptionMsg) {
        super(exceptionMsg);
        this.exceptionCode = exceptionCode;
    }

    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }
}
