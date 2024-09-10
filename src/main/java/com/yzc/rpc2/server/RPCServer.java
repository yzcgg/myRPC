package com.yzc.rpc2.server;

import com.yzc.rpc2.common.RPCRequest;
import com.yzc.rpc2.service.UserService;
import com.yzc.rpc2.service.impl.UserServiceImpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class RPCServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("server boot success.");
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                        RPCRequest request = (RPCRequest) ois.readObject();

                        Method method = userService.getClass().getMethod(request.getMethodName(), request.getParamsTypes());



                        oos.writeObject(user);
                        oos.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("IO failed");
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("server boot failed.");
        }
    }
}
