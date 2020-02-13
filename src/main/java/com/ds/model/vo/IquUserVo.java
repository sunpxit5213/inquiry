package com.ds.model.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqUser;
import lombok.Data;

/**
 * @ClassName: IquUserVo
 * @Author: sunpxit
 * @Description:
 * @Date: 2020/2/9 14:06
 */
@Data
public class IquUserVo extends InqUser {

   private Page page;

   private InqDoctorsVo doc;





}
