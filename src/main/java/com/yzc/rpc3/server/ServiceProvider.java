package com.yzc.rpc3.server;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author : yzc
 * @Date:2024/9/17 - 09 - 17 - 7:53
 */
public class ServiceProvider {
    private Map<String, Object> interfaceProvider;
    public ServiceProvider () {
        this.interfaceProvider = new HashMap<>();
    }

    public void addServiceInterface (Object service) {
        String serviceName = service.getClass().getName();
        Class<?>[] interfaces = service.getClass().getInterfaces();

        for (Class clazz : interfaces) {
            System.out.println("class name = " + clazz.getName());
            interfaceProvider.put(clazz.getName(), service);
        }
    }

    public Object getInterface (String interfaceName) {
        return this.interfaceProvider.get(interfaceName);
    }
}
