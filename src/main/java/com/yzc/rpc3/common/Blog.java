package com.yzc.rpc3.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : yzc
 * @Date:2024/9/16 - 09 - 16 - 21:03
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Blog implements Serializable {
    private Integer blogId;
    private String title;
}
