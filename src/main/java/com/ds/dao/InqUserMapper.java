package com.ds.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.model.InqDoctors;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;

/**
 * <p>
 * 医生表
 * Mapper 接口
 * </p>
 *
 * @author dps
 * @since 2020-02-07
 */
public interface InqUserMapper extends BaseMapper<InqUser> {

    IquUserVo getByIds(Integer reId);


    InqDoctors getByDoc();



}
