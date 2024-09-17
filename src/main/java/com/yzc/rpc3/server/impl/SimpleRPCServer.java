package com.yzc.rpc3.server.impl;

import com.yzc.rpc3.server.RPCServer;
import com.yzc.rpc3.server.WorkThread;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:25
 */
@NoArgsConstructor
@Data
@Builder
public class SimpleRPCServer implements RPCServer {
    private Map<String, Object> serviceProvider;

    public SimpleRPCServer (Map<String, Object> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public void start(Integer port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("server started successful...");
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new WorkThread(serviceProvider, socket)).start();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("server started failed");
        }
    }

    @Override
    public void stop() {

    }
}
