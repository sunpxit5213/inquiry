package com.ds.controller.special;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.common.util.ResultData;
import com.ds.model.InqUser;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: loginController
 * @Author: sunpxit
 * @Description: 登录
 * @Date: 2020/2/7 16:50
 */
@RestController
@RequestMapping("/login")
public class loginController {

    @Autowired
    InqUserService inqUserService;


    @PostMapping("/main")
    public ResultData login(@RequestBody InqUser inqUser) {
        //通过用户名查询
        QueryWrapper<InqUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name",inqUser.getUserName());
        InqUser one = inqUserService.getOne(queryWrapper);

        //判断用户名是否正确
        if (one!=null){
            System.out.println("报错了");

        }


        return new ResultData(inqUser);
    }

}
