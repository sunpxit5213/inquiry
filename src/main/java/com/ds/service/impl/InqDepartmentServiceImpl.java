package com.ds.service.impl;

import com.ds.common.util.ResultData;
import com.ds.model.InqDepartment;
import com.ds.dao.InqDepartmentMapper;
import com.ds.model.vo.InqDepartmentVo;
import com.ds.service.InqDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 科室表  服务实现类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Service
public class InqDepartmentServiceImpl extends ServiceImpl<InqDepartmentMapper, InqDepartment> implements InqDepartmentService {

    @Autowired
    InqDepartmentMapper inqDepartmentMapper;

    @Override
    public ResultData quPage(InqDepartmentVo vo) {
        return new ResultData(inqDepartmentMapper.ipPge(vo.getPage()));
    }
}
