package com.xzh.vueblog.service.impl;

import com.xzh.vueblog.entity.User;
import com.xzh.vueblog.mapper.UserMapper;
import com.xzh.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xzh
 * @since 2020-06-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
