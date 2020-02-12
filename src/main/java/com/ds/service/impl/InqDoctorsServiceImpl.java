package com.ds.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.common.util.ResultData;
import com.ds.model.InqDoctors;
import com.ds.dao.InqDoctorsMapper;
import com.ds.service.InqDoctorsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Service
public class InqDoctorsServiceImpl extends ServiceImpl<InqDoctorsMapper, InqDoctors> implements InqDoctorsService {

    @Override
    public ResultData queryIdleDoc(Integer depId) {
        QueryWrapper<InqDoctors> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("doc_subject", depId).eq("doc_status", 1);
        return new ResultData(list(queryWrapper));
    }

    @Override
    public ResultData queryIdleDoc() {
        QueryWrapper<InqDoctors> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("doc_status", 1);
        return new ResultData(list(queryWrapper));
    }
}
