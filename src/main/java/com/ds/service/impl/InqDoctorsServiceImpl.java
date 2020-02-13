package com.ds.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.common.util.ResultData;
import com.ds.dao.InqDoctorsMapper;
import com.ds.model.InqDoctors;
import com.ds.model.InqUser;
import com.ds.model.vo.InqDoctorsVo;
import com.ds.service.InqDoctorsService;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Autowired
    InqDoctorsMapper inqDoctorsMapper;

    @Autowired
    InqUserService inqUserService;


    @Override
    public List<InqDoctors> queryIdleDoc(Integer depId) {
        QueryWrapper<InqDoctors> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("doc_subject", depId).eq("doc_status", 1);
        return list(queryWrapper);
    }

    @Override
    public List<InqDoctors> queryIdleDoc() {
        QueryWrapper<InqDoctors> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("doc_status", 1);
        return list(queryWrapper);
    }

    @Override
    public ResultData queryPage(Page page, InqDoctors inqDoctors) {
        return new ResultData(inqDoctorsMapper.getPage(page, inqDoctors));
    }


    @Override
    public ResultData docSave(InqDoctors inqDoctors) {

        save(inqDoctors);
        return new ResultData(inqDoctors);
    }

    @Override
    public InqDoctorsVo getBy(Integer id) {
        InqDoctors on = new InqDoctors();
        on.setId(id);
        IPage<InqDoctorsVo> page = inqDoctorsMapper.getPage(new Page(), on);
        List<InqDoctorsVo> records = page.getRecords();
        return records.get(0);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData del(Integer id) {
        QueryWrapper<InqUser> userQueryWrapper = new QueryWrapper<>();
        InqDoctors byId = getById(id);

        //更新用户角色
        userQueryWrapper.eq("id", byId.getDocName());
        InqUser inqUser = new InqUser();
        inqUser.setUserType(1);

        //删除医生
        removeById(id);

        inqUserService.update(inqUser, userQueryWrapper);


        return new ResultData("删除成功");
    }
}
