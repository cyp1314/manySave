package com.example.manysave.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExcHandler {
    /**
     * @description:处理由断言，IllegalArgumentException抛出得异常信息
     * @return java.lang.String
     */
    @ResponseBody
    @ExceptionHandler(value = IllegalArgumentException.class)
    public String handleArgError(IllegalArgumentException e){
        return e.getMessage();
    }
}