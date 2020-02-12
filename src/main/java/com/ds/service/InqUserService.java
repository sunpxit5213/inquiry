package com.ds.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.common.util.ResultData;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;

/**
 * <p>
 * 医生表
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqUserService extends IService<InqUser> {


    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 分页查询
     * @date : 2020/02/13 00:22:13
     * @params : iquUserVo
     */
    ResultData quePage(IquUserVo iquUserVo);


    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 医生详情
     * @date : 2020/02/13 00:22:33
     * @params : integer
     */
    ResultData inquire(Integer integer);

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 查询当前用户
     * @date : 2020/02/13 00:25:13
     * @params :
     */
    ResultData queryUser();

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 完善用户信息
     * @date : 2020/02/13 00:32:50
     * @params :
     */
    ResultData saveImg();

}
