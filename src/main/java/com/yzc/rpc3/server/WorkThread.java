package com.yzc.rpc3.server;

import com.yzc.rpc3.common.RPCRequest;
import com.yzc.rpc3.common.RPCResponse;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Map;
import java.util.Objects;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:37
 */
@AllArgsConstructor
public class WorkThread implements Runnable{
    private Map<String, Object> serviceProvider;
    private Socket socket;

    @Override
    public void run() {
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            RPCRequest request = (RPCRequest) ois.readObject();

            RPCResponse response = getResponse(request);
            oos.writeObject(response);
            oos.flush();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("IO read data failed");
        }
    }

    private RPCResponse getResponse (RPCRequest request) {
        String interfaceName = request.getInterfaceName();
        System.out.println("interfaceName = " + interfaceName);
        Object service = serviceProvider.get(interfaceName);
        Method method = null;
        try {
            method = service.getClass().getMethod(request.getMethodName(), request.getParamTypes());
            Object data =  method.invoke(request.getParams());
            return RPCResponse.success(data);
        }
        catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("method invoke failed...");
            return RPCResponse.fail();
        }
    }
}
