package com.ds.service;

import com.ds.common.util.ResultData;
import com.ds.model.InqDoctors;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqDoctorsService extends IService<InqDoctors> {

    /**
    * @author  : sunpx
    * @desc    : 查询空闲医生
    * @date    : 2020/02/13 00:48:22
    * @params  : depId :科室id
    * @return  : com.ds.common.util.ResultData
    */
    ResultData queryIdleDoc(Integer depId);

    /**
     * @author  : sunpx
     * @desc    : 查询所有空闲医生
     * @date    : 2020/02/13 00:48:22
     * @params  :
     * @return  : com.ds.common.util.ResultData
     */
    ResultData queryIdleDoc();

}
