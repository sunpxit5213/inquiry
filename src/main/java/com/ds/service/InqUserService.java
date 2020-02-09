package com.ds.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;

/**
 * <p>
 * 医生表
 服务类
 * </p>
 *
 * @author dps
 * @since 2020-02-07
 */
public interface InqUserService extends IService<InqUser> {


    /**
    * @author  : sunpx
    * @desc    : 分页查询
    * @date    : 2020/02/09 14:34:50
    * @params  : userVo
    * @return  : com.baomidou.mybatisplus.core.metadata.IPage<com.ds.model.InqUser>
    */
    IPage<InqUser> queryPage(IquUserVo userVo);


    Object getByIds(Integer id);

}
