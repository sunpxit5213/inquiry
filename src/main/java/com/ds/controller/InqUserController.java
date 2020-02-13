package com.ds.controller;


import com.ds.common.enums.InqEXEnu;
import com.ds.common.exception.InquiryException;
import com.ds.common.util.OSSUtil;
import com.ds.common.util.ResultData;
import com.ds.common.util.UserInfo;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;
import com.ds.service.InqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * 医生表
 * 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@RestController
@RequestMapping("/inqUser")
public class InqUserController {

    @Autowired
    private InqUserService inqUserService;

    OSSUtil ossUtil = new OSSUtil();


    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 分页查询
     * @date : 2020/02/13 11:35:53
     * @params : in
     */
    @PostMapping("queryPage")
    public ResultData que(@RequestBody IquUserVo in) {
        return inqUserService.quePage(in);
    }

    /**
     * @return :
     * @author : sunpx
     * @desc : 查看详情
     * @date : 2020/02/13 11:36:28
     * @params : null
     */
    @GetMapping("getById")
    public ResultData byId(Integer id, Integer stu) {
        if (stu == 2) {
            return inqUserService.inquire(id);
        } else {
            return new ResultData(inqUserService.getById(id));
        }

    }

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 获取当前用户信息
     * @date : 2020/02/13 19:46:15
     * @params :
     */
    @GetMapping("getUser")
    public ResultData getUser() {
        return inqUserService.queryUser();
    }

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 删除用户
     * @date : 2020/02/13 20:00:08
     * @params : id
     */
    @GetMapping("del")
    public ResultData del(Integer id) {
        return inqUserService.del(id);
    }

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 上传头像
     * @date : 2020/02/13 19:46:41
     * @params : img
     */
    @PostMapping("upload")
    @ResponseBody
    public ResultData upload(MultipartFile img) {
        UserInfo userInfo = new UserInfo();
        if (userInfo.getId() != null) {

            InqUser byId = inqUserService.getById(userInfo.getId());


            try {
                InputStream inputStream = img.getInputStream();
                String originalFilename = img.getOriginalFilename();
                String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
                String upload = ossUtil.upload(substring, inputStream);
                //删除原来图片
                ossUtil.delLoad(byId.getImgUrl());
                byId.setImgUrl(upload);
                inqUserService.save(byId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new InquiryException(InqEXEnu.USER_LAPSE);
        }

        return new ResultData("上传成功");
    }

}

