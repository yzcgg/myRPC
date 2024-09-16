package com.yzc.rpc2.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer userId;
    private String userName;
    /** 性别: 1-男, 0-女*/
    private Integer gender;

    private Integer age;
}
