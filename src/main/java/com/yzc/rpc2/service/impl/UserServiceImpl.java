package com.yzc.rpc2.service.impl;

import com.yzc.rpc2.common.User;
import com.yzc.rpc2.service.UserService;

import java.util.Random;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfoByUserId(Integer userId) {
        Random random = new Random();
        int randomNumForName = random.nextInt(0,100);
        String randUserName = "赛博程哥" + randomNumForName;
        String nickName = "紫色角闪石" + randomNumForName;
        String phoneNum = "+86 " + random.nextInt(10000000, 99999999);
        User user = User.builder()
                .userId(userId)
                .age(random.nextInt(0,121))
                .userName(randUserName)
                .nickName(nickName)
                .gender(random.nextInt(0,2))
                .phoneNum(phoneNum)
                .build();
        return user;
    }

    @Override
    public Integer addUser(User user) {
        System.out.println("add user successful" + user.toString());
        return 1;
    }


}
