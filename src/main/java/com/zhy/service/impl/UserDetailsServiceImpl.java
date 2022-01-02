package com.zhy.service.impl;

import com.zhy.entity.LoginUser;
import com.zhy.entity.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 登录业务查询数据库
 * @author zhy
 * @since 2022/1/2 18:33
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 查询数据库
        SecurityUser securityUser = new SecurityUser();
        if (s.equals("admin")){
            LoginUser loginUser = new LoginUser();
            loginUser.setUsername("admin");
            loginUser.setPassword("123456");
            securityUser.setCurrentUserInfo(loginUser);
            List<String> list = new ArrayList<>();
            list.add("add");
            securityUser.setPermissionValueList(list);
            return securityUser;
        }else if (s.equals("admin1")){
            LoginUser loginUser = new LoginUser();
            loginUser.setUsername("admin1");
            loginUser.setPassword("1234567");
            securityUser.setCurrentUserInfo(loginUser);
            List<String> list = new ArrayList<>();
            list.add("add");
            securityUser.setPermissionValueList(list);
            return securityUser;
        }
        throw new UsernameNotFoundException("用户不存在");
    }
}
