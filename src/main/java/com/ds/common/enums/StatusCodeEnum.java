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

    TOKEN_LAPSE(1040,"token错误"),
    USER_AND_PASSWORD(1051,"密码错误"),
    USER_IS_PASSWORD(1052,"用户名错误")



    ;
    private Integer code;
    private String msg;

    StatusCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
