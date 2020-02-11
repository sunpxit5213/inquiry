package com.ds.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: WebConfig
 * @Author: sunpxit
 * @Description:
 * @Date: 2020/2/11 11:33
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "OPTIONS", "PUT")
                .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                        "Access-Control-Request-Headers")
                .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
                .allowCredentials(true).maxAge(3600);
    }

}