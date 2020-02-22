package com.ds.controller;


import com.ds.common.util.ResultData;
import com.ds.model.vo.InqDepartmentVo;
import com.ds.service.InqDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 科室表  前端控制器
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@RestController
@RequestMapping("/inqDepartment")
public class InqDepartmentController {

    @Autowired
    InqDepartmentService inqDepartmentService;

    @PostMapping("queryPage")
    public ResultData queryPage(@RequestBody InqDepartmentVo inqDepartmentVo){
            return inqDepartmentService.quPage(inqDepartmentVo);
    }

}

