package com.ds.controller;


import com.ds.service.InqDoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Controller
@RequestMapping("/inqDoctors")
public class InqDoctorsController {

    @Autowired
    InqDoctorsService inqDoctorsService;



}

