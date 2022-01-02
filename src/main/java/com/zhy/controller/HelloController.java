package com.zhy.controller;

import com.zhy.handler.BusinessException;
import com.zhy.utils.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhy
 * @since 2022/1/2 17:06
 */
@RestController
public class HelloController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/doget")
    public ResultResponse<Authentication> doGet2() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.getDetails();

        return ResultResponse.success("查询成功", authentication);
    }
}
