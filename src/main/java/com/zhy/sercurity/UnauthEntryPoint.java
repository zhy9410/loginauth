package com.zhy.sercurity;

import com.zhy.utils.ResponseUtil;
import com.zhy.utils.ResultResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 异常认证之后认证入口
 * @author zhy
 * @since 2022/1/2 17:04
 */
public class UnauthEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        ResponseUtil.out(httpServletResponse, ResultResponse.error("认证失败"));
    }
}
