package com.ds.model.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqDepartment;
import lombok.Data;

/**
 * @ClassName: InqDepartmentVo
 * @Author: sunpxit
 * @Description: kes
 * @Date: 2020/2/14 0:35
 */
@Data
public class InqDepartmentVo extends InqDepartment {
  private  Page page;

  private String typeName;
}
