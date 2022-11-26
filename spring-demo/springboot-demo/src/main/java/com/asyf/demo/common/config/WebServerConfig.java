package com.asyf.demo.common.config;

import com.asyf.demo.common.serializer.DateFormatterAnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Configuration
public class WebServerConfig {

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        // Config the Json convert Chinese garbled.
        // 这里的配置可能会导致application.properties文件中spring.jackson.time-zone=GMT+8失效
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

        // 不设置Utf-8格式,可能会导致Mock测试输出信息乱码
        converter.setDefaultCharset(StandardCharsets.UTF_8);

        ObjectMapper objectMapper = converter.getObjectMapper();
        objectMapper.setTimeZone(TimeZone.getDefault());
        //自省程序
        objectMapper.setAnnotationIntrospector(new DateFormatterAnnotationIntrospector());
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
        return converter;
    }
}

