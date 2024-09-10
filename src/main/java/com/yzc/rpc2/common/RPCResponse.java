package com.yzc.rpc2.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RPCResponse implements Serializable {
    /** 响应状态码 */
    private Integer code;
    /** 响应信息 */
    private String message;
    /** 响应数据 */
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
