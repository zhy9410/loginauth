package com.zhy.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * 统一返回实体类
 * @author zhy
 * @since 2022/1/2 17:14
 */
@Getter
@Setter
public class ResultResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public ResultResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> ResultResponse<T> success(String message, T data){
        return new ResultResponse(true, message, data);
    }

    public static <T> ResultResponse<T> error(String message){
        return new ResultResponse(false, message, null);
    }
}
