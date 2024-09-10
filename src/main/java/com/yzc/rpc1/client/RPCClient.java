package com.yzc.rpc1.client;

import com.yzc.rpc1.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Random;

public class RPCClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7777);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            objectOutputStream.writeInt(new Random().nextInt(0,100000));
            objectOutputStream.flush();

            User user = (User) objectInputStream.readObject();
            System.out.println("server reply = " + user.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("client boot failed.");
        }
    }
}
