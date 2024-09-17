package com.yzc.rpc3.service.impl;

import com.yzc.rpc3.common.User;
import com.yzc.rpc3.service.UserService;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:09
 */
public class UserServiceImpl implements UserService {
    @Override
    public Integer addUser(User user) {
        System.out.println("add user success ...");
        return 1;
    }

    @Override
    public User getUserInfoByUserId(Integer userId) {
        User fakeData = User.builder()
                .userId(2002)
                .gender(1)
                .name("Wang Wu")
                .build();
        return fakeData;
    }
}
