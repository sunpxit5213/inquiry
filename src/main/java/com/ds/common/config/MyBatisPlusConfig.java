package com.ds.common.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :sunpx
 * @date :created in 2020/1/12 11:27
 * @desc :配置文件
 */
@Configuration
public class MyBatisPlusConfig {


    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return  new PaginationInterceptor();
    }

    @Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }
}
