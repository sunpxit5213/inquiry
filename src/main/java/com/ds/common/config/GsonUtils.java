package com.ds.common.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ClassName: JacksonConfig
 * @Author: sunpxit
 * @Description: 前端转换器
 * @Date: 2020/2/7 12:41
 */

@Configuration
public class GsonUtils {
    @Bean
    public ObjectMapper serializingObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        return objectMapper;
    }
}
