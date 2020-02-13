package com.ds.common.enums;

/**
 * @ClassName: InqEXEnu
 * @Author: sunpxit
 * @Description: 异常状态码
 * @Date: 2020/2/13 16:30
 */

public enum  InqEXEnu {

    USER_LAPSE(1500,"未登录");

    private Integer code;
    private String msg;

    InqEXEnu(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
