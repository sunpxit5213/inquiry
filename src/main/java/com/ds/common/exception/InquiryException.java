package com.ds.common.exception;

import com.ds.common.enums.InqEXEnu;

/**
 * @ClassName: InquiryException
 * @Author: sunpxit
 * @Description: 异常
 * @Date: 2020/2/13 16:28
 */
public class InquiryException extends RuntimeException {

    private Integer code;

    private Object data;

   public InquiryException(InqEXEnu inqEXEnu){
       super(inqEXEnu.getMsg());
       this.code=inqEXEnu.getCode();
       this.data="";

   }

   public InquiryException(){
       super("服务器异常");
       this.code=500;
       this.data="";
   }
}
