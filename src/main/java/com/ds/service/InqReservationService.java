package com.ds.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.common.util.ResultData;
import com.ds.model.InqReservation;
import com.ds.model.vo.InqReservationVo;

/**
 * <p>
 * 挂号表 服务类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqReservationService extends IService<InqReservation> {

    /**
     * @author  : sunpx
     * @desc    : 分页查询
     * @date    : 2020/02/22 11:13:37
     * @params  : page
     * @return  : com.ds.common.util.ResultData
     */
    ResultData queryPage(InqReservationVo inqReservationVo);


    /**
    * @author  : sunpx
    * @desc    : 挂号
    * @date    : 2020/02/22 11:16:06
    * @params  : inqReservation
    * @return  : com.ds.common.util.ResultData
    */
    ResultData reservation(InqReservation inqReservation);


    /**
    * @author  : sunpx
    * @desc    : 查看详情
    * @date    : 2020/02/22 11:18:51
    * @params  : null
    * @return  :
    */
    ResultData getBy(Integer id);







}
