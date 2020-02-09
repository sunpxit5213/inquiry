package com.ds.controller;


import com.ds.common.util.ResultData;
import com.ds.model.InqUser;
import com.ds.model.vo.IquUserVo;
import com.ds.service.InqUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 医生表
 * 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-07
 */
@RestController
@RequestMapping("/inqUser")
@Slf4j
public class InqUserController {

    @Autowired
    InqUserService inqUserService;

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 分页查找
     * @date : 2020/02/09 14:39:02
     * @params : iquUserVo
     */
    @GetMapping("queryPage")
    public ResultData queryPage(@RequestBody IquUserVo iquUserVo) {
        return new ResultData(inqUserService.queryPage(iquUserVo));
    }

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 查看详情
     * @date : 2020/02/09 19:28:00
     * @params : id
     */
    @GetMapping("inquire")
    public ResultData getBayId(@RequestParam Integer id) {

        return new ResultData(inqUserService.getByIds(id));
    }

    /**
     * @return : com.ds.common.util.ResultData
     * @author : sunpx
     * @desc : 删除:暂时不开放
     * @date : 2020/02/09 19:28:14
     * @params : ids
     */
    @GetMapping("del")
    public ResultData getDel(@RequestBody Map<String, List> ids) {
        log.info(ids.get("ids").toString());
        return new ResultData();
    }


    @PostMapping("save")
    public ResultData getSave(@RequestBody InqUser user){
        inqUserService.save(user);
        return new ResultData(user);

    }
}

