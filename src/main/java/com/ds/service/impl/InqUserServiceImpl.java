package com.ds.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
 * @since 2020-02-07
 */
@Service
public class InqUserServiceImpl extends ServiceImpl<InqUserMapper, InqUser> implements InqUserService {

    @Autowired
    private InqUserMapper inqUserMapper;

    @Override
    public IPage<InqUser> queryPage(IquUserVo userVo) {

        QueryWrapper<InqUser> queryWrapper = new QueryWrapper<>();

        return page(userVo.getPage(), queryWrapper);
    }

    @Override
    public Object getByIds(Integer id) {
        QueryWrapper<InqUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        InqUser one = getOne(queryWrapper);

        /**
         * 判断是否是医生
         */
        if (one.getUserType()==2){
            return inqUserMapper.getByIds(id);
        }
            return one;
    }


}
