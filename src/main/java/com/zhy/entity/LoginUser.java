package com.zhy.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class LoginUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String nickName;

    private String salt;

    private String token;

}

