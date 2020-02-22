package com.ds.model.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqReservation;
import lombok.Data;

/**
 * @ClassName: InqReservationVo
 * @Author: sunpxit
 * @Description: 挂号增强
 * @Date: 2020/2/22 11:09
 */
@Data
public class InqReservationVo extends InqReservation {

   private Page page;

   /**
    * 用户名
    */
   private String userName;
   /**
    * 医生名
    */
   private String docName;
}
