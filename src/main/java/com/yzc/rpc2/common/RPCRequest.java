package com.yzc.rpc2.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RPCRequest implements Serializable {
    /** 接口名 */
    private String interfaceName;
    /** 方法名 */
    private String methodName;
    /** 参数列表 */
    private Object[] params;
    /** 参数类型 */
    private Class<?>[] paramsTypes;
}
