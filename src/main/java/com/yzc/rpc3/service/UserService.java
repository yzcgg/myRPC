package com.yzc.rpc3.service;

import com.yzc.rpc3.common.User;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:06
 */
public interface UserService {
    Integer addUser (User user);
    User getUserInfoByUserId (Integer userId);
}
