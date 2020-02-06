package com.ds.common.util;

import lombok.Data;

/**
 * @author :sunpx
 * @date :created in 2020/1/12 16:48
 * @desc :统一的返回参数
 */
@Data
public class ResultData {

    private String message;// 结果信息
    private Integer Code;// 代码 当值等于0时，为成功
    private Object data = "";//结果集

    public ResultData(){super();}

    public ResultData(Integer code, String msg) {
        this.Code = code;
        this.message = msg;
    }
    public ResultData(Object resultData){
        this.data = resultData;
        this.Code = 0;
        this.message = "ok";
    }
}
