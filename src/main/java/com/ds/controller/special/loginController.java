package com.ds.controller.special;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.common.enums.StatusCodeEnum;
import com.ds.common.util.ResultData;
import com.ds.common.util.SignUtil;
import com.ds.model.InqUser;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

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
    Digester md5 = new Digester(DigestAlgorithm.MD5);


    @PostMapping("/main")
    public ResultData login(@RequestBody InqUser inqUser, HttpServletResponse response) {
        //通过用户名查询
        QueryWrapper<InqUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", inqUser.getUserName());
        InqUser one = inqUserService.getOne(queryWrapper);

        //判断用户名是否正确
        if (one != null) {
            //获取加密盐
            String userSalt = one.getUserSalt();
            //用户传输密码
            String reqPassword = inqUser.getPassword();


            //将用户输入密码与盐一起加密
            String digestHex = md5.digestHex(userSalt + reqPassword);

            //判断密码是否正确
            if (one.getPassword().equals(digestHex)) {
                SignUtil.setCookie(response, "token");
                return new ResultData("ok");
            }
            return new ResultData(StatusCodeEnum.USER_AND_PASSWORD.getCode(), StatusCodeEnum.USER_AND_PASSWORD.getMsg());


        }


        return new ResultData(StatusCodeEnum.USER_IS_PASSWORD.getCode(), StatusCodeEnum.USER_IS_PASSWORD.getMsg());

    }


    @PostMapping("/save")
    public ResultData inqSave(@RequestBody InqUser inqUser, HttpServletResponse response) {
        //加密盐
        String UUID = SecureUtil.simpleUUID();
        //用户输入密码
        String password = inqUser.getPassword();
        //保存加密盐
        inqUser.setUserSalt(UUID);
        // 将密码和加密盐一起加密保存在密码里
        inqUser.setPassword(md5.digestHex(UUID + password));


        boolean save = inqUserService.save(inqUser);
        if (save){
            //更新签名
            SignUtil.setCookie(response, "token");
        }
        return new ResultData("登录成功");
    }

}
