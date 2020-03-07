package com.ds.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.common.util.ResultData;
import com.ds.dao.InqReservationMapper;
import com.ds.model.InqReservation;
import com.ds.model.vo.InqReservationVo;
import com.ds.service.InqReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 挂号表 服务实现类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Service
public class InqReservationServiceImpl extends ServiceImpl<InqReservationMapper, InqReservation> implements InqReservationService {

    @Autowired
    InqReservationMapper inqReservationMapper;


    @Override
    public ResultData queryPage(InqReservationVo inqReservationVo) {
        return new ResultData(inqReservationMapper.queryPage(inqReservationVo.getPage(),
                inqReservationVo));
    }

    @Override
    public ResultData reservation(InqReservation inqReservation) {
        return new ResultData(save(inqReservation));
    }

    @Override
    public ResultData getBy(Integer id) {
        return new ResultData(inqReservationMapper.getBy(id));
    }


    @Overrideq
    public Integer uantity(Integer b) {
        QueryWrapper<InqReservation> queryWrapper=new QueryWrapper<>();
        if (b==1){
            queryWrapper.eq("res_status",b);

        }
        return  list(queryWrapper).size();
    }
}
