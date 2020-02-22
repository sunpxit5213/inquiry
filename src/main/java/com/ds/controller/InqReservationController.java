package com.ds.controller;


import com.ds.common.util.ResultData;
import com.ds.model.vo.InqReservationVo;
import com.ds.service.InqReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 挂号表 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@RestController
@RequestMapping("/inqReservation")
public class InqReservationController {

    @Autowired
    InqReservationService inqReservationService;

    public ResultData query(@RequestBody InqReservationVo inqReservationVo){

    return inqReservationService.queryPage(inqReservationVo);
    }

}

