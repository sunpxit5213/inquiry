package com.ds.controller.special;

import com.ds.common.util.ResultData;
import com.ds.model.InqDoctors;
import com.ds.service.InqDoctorsService;
import com.ds.service.InqReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: LoginMain
 * @Author: sunpxit
 * @Description: 主页信息
 * @Date: 2020/3/1 14:46
 */
@RestController
@RequestMapping("/main")
public class LoginMain {
    @Autowired
    InqDoctorsService inqDoctorsService;

    @Autowired
    InqReservationService inqReservationService;


    @GetMapping("mainJob")
    public ResultData mainJob() {
        Map map = new HashMap();

        List<InqDoctors> inqDoctors = inqDoctorsService.queryIdleDoc();
        Integer quantity = inqReservationService.quantity(1);
        Integer quantity1 = inqReservationService.quantity(2);
        //
        map.put("ghNu", quantity);
        map.put("wcGH", quantity1);
        map.put("docNu", inqDoctors.size());

        return new ResultData(map);

    }
}
