package com.ds.common.enums;

import lombok.Getter;

/**
 * @ClassName: GoodsStatusEnum
 * @Author: sunpxit
 * @Description: 状态码枚举
 * @Date: 2020/2/5 12:49
 */
@Getter
public enum StatusCodeEnum {

    TOKEN_LAPSE(1040,"token失效"),
    TOKEN_FAILURE(1041,"token验证失败")


    ;
    private Integer code;
    private String msg;

    StatusCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
