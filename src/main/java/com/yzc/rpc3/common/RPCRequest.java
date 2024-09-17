package com.yzc.rpc3.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:39
 */
@Data
@Builder
@AllArgsConstructor
public class RPCRequest implements Serializable {
    private String interfaceName;
    private String methodName;
    private Object[] params;
    private Class<?>[] paramTypes;
}
