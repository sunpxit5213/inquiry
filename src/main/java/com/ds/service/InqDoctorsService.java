package com.ds.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.common.util.ResultData;
import com.ds.model.InqDoctors;
import com.ds.model.vo.InqDoctorsVo;

import java.util.List;

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
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 查询空闲医生
     * @date : 2020/02/13 00:48:22
     * @params : depId :科室id
     */
    List<InqDoctors> queryIdleDoc(Integer depId);

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 查询所有空闲医生
     * @date : 2020/02/13 00:48:22
     * @params :
     */
    List<InqDoctors> queryIdleDoc();

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 分页查询
     * @date : 2020/02/13 10:50:21
     * @params : page,inqDoctors
     */
    ResultData queryPage(Page page, InqDoctors inqDoctors);


    /**
    * @author  : sunpx
    * @desc    : 添加医生
    * @date    : 2020/02/13 11:17:33
    * @params  : inqDoctors
    * @return  : com.ds.common.util.ResultData
    */
    ResultData docSave(InqDoctors inqDoctors);


    /**
    * @author  : sunpx
    * @desc    : 查看医生详情
    * @date    : 2020/02/13 11:22:59
    * @params  : null
    * @return  :
    */
    InqDoctorsVo getBy(Integer id);


    /**
    * @author  : sunpx
    * @desc    : 删除
    * @date    : 2020/02/13 20:05:14
    * @params  : null
    * @return  :
    */
    ResultData del(Integer id);

}
