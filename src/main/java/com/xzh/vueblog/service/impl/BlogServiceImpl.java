package com.xzh.vueblog.service.impl;

import com.xzh.vueblog.entity.Blog;
import com.xzh.vueblog.mapper.BlogMapper;
import com.xzh.vueblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
