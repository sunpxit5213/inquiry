package com.ds.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqDepartment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.model.vo.InqDepartmentVo;

/**
 * <p>
 * 科室表  Mapper 接口
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqDepartmentMapper extends BaseMapper<InqDepartment> {

    IPage<InqDepartmentVo> ipPge(Page page);

}
