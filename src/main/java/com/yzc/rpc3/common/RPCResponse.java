package com.yzc.rpc3.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:45
 */
@Data
@Builder
public class RPCResponse implements Serializable {
    private Integer code;
    private String message;
    private Object data;

    public static RPCResponse success(Object data) {
        return RPCResponse.builder()
                .code(200)
                .message("OK")
                .data(data)
                .build();
    }

    public static RPCResponse fail() {
        return RPCResponse.builder()
                .code(500)
                .message("server error ...")
                .build();
    }
}
