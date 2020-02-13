package com.ds.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.common.util.ResultData;
import com.ds.common.util.UserInfo;
import com.ds.dao.InqUserMapper;
import com.ds.model.InqDoctors;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;
import com.ds.service.InqDoctorsService;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    InqDoctorsService inqDoctorsService;


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
        UserInfo userInfo = new UserInfo();
        System.out.println(userInfo);
        return new ResultData(getById(new UserInfo().getId()));
    }

    @Override
    public ResultData saveImg() {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData del(Integer id) {
        QueryWrapper<InqUser> userWrapper= new QueryWrapper<>();
        QueryWrapper<InqDoctors> docWrapper= new QueryWrapper<>();

        //删除用户的附加角色
        docWrapper.eq("doc_user",id);
        inqDoctorsService.remove(docWrapper);

        //删除用户
        userWrapper.eq("id",id);
        inqUserMapper.delete(userWrapper);
        return new ResultData("删除成功");
    }
}
