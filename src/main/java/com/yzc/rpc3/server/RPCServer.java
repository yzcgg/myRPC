package com.yzc.rpc3.server;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:23
 */
public interface RPCServer {
    void start (Integer port);
    void stop ();
}
