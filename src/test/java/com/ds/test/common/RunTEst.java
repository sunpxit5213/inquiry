package com.ds.test.common;

import com.ds.dao.InqUserMapper;
import com.ds.service.InqUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: RunTEst
 * @Author: sunpxit
 * @Description:
 * @Date: 2020/2/9 18:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RunTEst {
    @Autowired
    private InqUserService inqUserService;

    @Autowired
    InqUserMapper inqUserMapper;


}
