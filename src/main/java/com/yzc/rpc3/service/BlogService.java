package com.yzc.rpc3.service;

import com.yzc.rpc3.common.Blog;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:07
 */
public interface BlogService {
    Blog getBlogInfoByBlogId (Integer blogId);
}
