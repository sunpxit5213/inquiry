package com.ds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: InquiryApplication
 * @Author: sunpxit
 * @Description: 启动类
 * @Date: 2020/2/6 15:06
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ds.dao")
//@ServletComponentScan
public class InquiryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InquiryApplication.class, args);
    }

}
