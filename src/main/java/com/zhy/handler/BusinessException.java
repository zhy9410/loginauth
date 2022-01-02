package com.zhy.handler;

import lombok.Data;
/**
 * 业务异常
 * @author zhy
 * @since 2022/1/2 17:06
 */
@Data
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
