package com.zhy.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 响应工具
 * @author zhy
 * @since 2022/1/2 17:14
 */
public class ResponseUtil {

    public static void out(HttpServletResponse response, ResultResponse resultResponse) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try {
            mapper.writeValue(response.getWriter(), resultResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
