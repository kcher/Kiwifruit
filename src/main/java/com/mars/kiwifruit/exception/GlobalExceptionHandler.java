package com.mars.kiwifruit.exception;

import com.mars.kiwifruit.dto.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    public R illegalArgumentExceptionHandler(IllegalArgumentException e) {
        return R.error(ExceptionCode.ILLEGAL_ARGUMENT.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public R myExceptionHandler(MyException e) {
        return R.error(e.getExceptionCode().getCode(), e.getMessage());
    }
}
