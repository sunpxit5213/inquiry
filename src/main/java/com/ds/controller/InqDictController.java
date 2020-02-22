package com.ds.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.common.util.ResultData;
import com.ds.model.InqDict;
import com.ds.model.vo.InqDictVo;
import com.ds.service.InqDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 字典表 前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@RestController
@RequestMapping("/inqDict")
public class InqDictController {
    @Autowired
    InqDictService inqDictService;

    /**
     * 根据类型查询字典
     * @param type
     * @return
     */
    @GetMapping("getTypeAll")
    public ResultData getByType(String type){
        QueryWrapper<InqDict> queryWrapper=new QueryWrapper<>();
        return new ResultData(inqDictService.list(queryWrapper));
    }




    @PostMapping("queryPage")
    public ResultData queryPage(@RequestBody InqDictVo inqDictVo){

        QueryWrapper<InqDict> queryWrapper=new QueryWrapper<>();
        return new ResultData(inqDictService.page(inqDictVo.getPage(),queryWrapper));
    }
}

