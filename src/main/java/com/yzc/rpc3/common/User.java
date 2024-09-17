package com.yzc.rpc3.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:01
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer userId;
    /** 1-male, 0-female*/
    private Integer gender;
    private String name;
}
