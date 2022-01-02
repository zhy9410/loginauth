package com.zhy.sercurity;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 密码处理
 * @author zhy
 * @since 2022/1/2 17:52
 */
@Component
public class DefaultPasswordEncoder implements PasswordEncoder {

    // 对密码加密
    @Override
    public String encode(CharSequence charSequence) {
        return "123456";
    }
    // 密码比对
    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(encode(charSequence));
    }
}
