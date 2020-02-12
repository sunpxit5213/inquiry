package com.ds.controller;


import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 医生表
 * 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Controller
@RequestMapping("/inqUser")
public class InqUserController {

    @Autowired
    private InqUserService inqUserService;

}

