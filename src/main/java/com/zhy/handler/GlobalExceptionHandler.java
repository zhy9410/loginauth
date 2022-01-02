package com.zhy.handler;

import com.zhy.utils.ResultResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * 全局异常处理
 * @author zhy
 * @since 2022/1/2 17:06
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    //指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
    public ResultResponse<String> error(Exception e) {
        e.printStackTrace();
        return ResultResponse.error("执行了全局异常处理..");
    }

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    public ResultResponse error(ArithmeticException e) {
        e.printStackTrace();
        return ResultResponse.error("执行了ArithmeticException异常处理..");
    }

    //自定义异常
    @ExceptionHandler(BusinessException.class)
    public ResultResponse<String> error(BusinessException e) {
        e.printStackTrace();
        return ResultResponse.error(e.getMessage());
    }

}
