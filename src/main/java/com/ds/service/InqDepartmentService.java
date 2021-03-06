package com.ds.service;

import com.ds.common.util.ResultData;
import com.ds.model.InqDepartment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.model.vo.InqDepartmentVo;

/**
 * <p>
 * 科室表  服务类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqDepartmentService extends IService<InqDepartment> {
    ResultData quPage(InqDepartmentVo vo);
}
