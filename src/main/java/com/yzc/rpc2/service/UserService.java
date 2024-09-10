package com.yzc.rpc2.service;

import com.yzc.rpc2.common.User;

public interface UserService {
    /**
     * 通过userId查询用户全部信息
     * @param userId
     * @return User
     */
    User getUserInfoByUserId(Integer userId);

    /**
     * 插入一个user
     * @param user
     * @return 返回影响的行数
     */
    Integer addUser(User user);
}
