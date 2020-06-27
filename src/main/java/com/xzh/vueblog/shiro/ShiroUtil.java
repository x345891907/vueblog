package com.xzh.vueblog.shiro;

import org.apache.shiro.SecurityUtils;

/**
 * @Classname ShiroUtil
 * @Description TODO
 * @Date 2020/6/27 22:25
 * @Created by xzh
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
