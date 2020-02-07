package com.ds.controller;


import com.ds.common.util.ResultData;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 医生表
 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-07
 */
@RestController
@RequestMapping("/inqUser")
public class InqUserController {

    @Autowired
    InqUserService inqUserService;

    @GetMapping("queryPage")
    public ResultData queryPage(){

        return new ResultData(inqUserService.list(null));
    }

}

