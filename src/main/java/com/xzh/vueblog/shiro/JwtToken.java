package com.xzh.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Classname JwtToken
 * @Description TODO
 * @Date 2020/6/22 22:54
 * @Created by xzh
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}

