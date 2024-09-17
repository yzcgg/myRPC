package com.yzc.rpc3.service.impl;

import com.yzc.rpc3.common.Blog;
import com.yzc.rpc3.service.BlogService;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:08
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog getBlogInfoByBlogId(Integer blogId) {
        Blog fakeData = Blog.builder()
                .blogId(1001)
                .title("特朗普又遭遇刺杀?!")
                .build();
        return fakeData;
    }
}
