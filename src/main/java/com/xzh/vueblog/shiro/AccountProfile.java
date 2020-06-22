package com.xzh.vueblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname AccountProfile
 * @Description TODO
 * @Date 2020/6/22 23:09
 * @Created by xzh
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;
    private String username;
    private String avatar;
}
