package com.ds.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.common.util.ResultData;
import com.ds.common.util.UserInfo;
import com.ds.dao.InqUserMapper;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医生表
 * 服务实现类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Service
public class InqUserServiceImpl extends ServiceImpl<InqUserMapper, InqUser> implements InqUserService {

    @Autowired
    InqUserMapper inqUserMapper;


    @Override
    public ResultData quePage(IquUserVo iquUserVo) {
        QueryWrapper<InqUser> queryWrapper = new QueryWrapper<>();
        Page isPage = iquUserVo.getPage();
        return new ResultData(page(isPage, queryWrapper));
    }

    @Override
    public ResultData inquire(Integer integer) {

        return new ResultData(inqUserMapper.getByIds(integer));
    }

    @Override
    public ResultData queryUser() {
        return new ResultData(getById(new UserInfo().getId()));
    }

    @Override
    public ResultData saveImg() {
        return null;
    }
}
