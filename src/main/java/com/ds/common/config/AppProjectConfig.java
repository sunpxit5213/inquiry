package com.ds.common.config;

import com.ds.common.util.OSSUtil;

/**
 * @ClassName: AppProjectConfig
 * @Author: sunpxit
 * @Description: 批量注入
 * @Date: 2020/2/13 14:04
 */

//@SpringBootConfiguration
public class AppProjectConfig {

//    @ConfigurationProperties(prefix = "oss")
//    @Bean
    public OSSUtil ossUtil(){
        return new OSSUtil();
    }

}
