package com.yzc.rpc3.test;

import com.yzc.rpc3.server.RPCServer;
import com.yzc.rpc3.server.ServiceProvider;
import com.yzc.rpc3.server.impl.SimpleRPCServer;
import com.yzc.rpc3.service.BlogService;
import com.yzc.rpc3.service.UserService;
import com.yzc.rpc3.service.impl.BlogServiceImpl;
import com.yzc.rpc3.service.impl.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:26
 */
public class TestServer {
    public static void main(String[] args) {
        // 前5行代码相当于是把service层服务注册了一下
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();

//        Map<String, Object> serviceProvider = new HashMap<>();
//        serviceProvider.put("com.yzc.rpc3.service.UserService", userService);
//        serviceProvider.put("com.yzc.rpc3.service.BlogService", blogService);
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.addServiceInterface(userService);
        serviceProvider.addServiceInterface(blogService);

//        RPCServer rpcServer = new SimpleRPCServer(serviceProvider);
//        rpcServer.start(7777);
    }
}
