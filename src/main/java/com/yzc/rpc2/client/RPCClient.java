package com.yzc.rpc2.client;

import com.yzc.rpc2.common.User;
import com.yzc.rpc2.service.UserService;

public class RPCClient {
    public static void main(String[] args) {
        ClientProxy clientProxy = new ClientProxy("127.0.0.1", 7777);
        UserService proxy = clientProxy.getProxy(UserService.class);

        User userByUserId = proxy.getUserInfoByUserId(10);
        System.out.println("get user by Id, user = " + userByUserId.toString());

        User user = User.builder()
                .userId(916)
                .userName("Li 4")
                .gender(1)
                .age(30)
                .build();
        Integer affectRows = proxy.addUser(user);
        System.out.println("insert user, affect rows = " + affectRows);
    }
}
