package com.yzc.rpc1.service;

import com.yzc.rpc1.common.User;

public interface UserService {
    /**
     * 通过userId查询用户全部信息
     * @param userId
     * @return User
     */
    User getUserInfoByUserId(Integer userId);
}
