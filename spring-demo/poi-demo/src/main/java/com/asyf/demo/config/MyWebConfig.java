package com.asyf.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author yjz
 * @Date 2021/8/17 20:18
 */
//@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {

    /**
     * SpringBoot配置Swagger2出现页面无法访问错误:No mapping for GET /swagger-ui.html
     * <p>
     * 如果继承了WebMvcConfigurationSupport，则在yml中配置的相关内容会失效。 需要重新指定静态资源
     * 注意：如果继承了WebMvcConfigurationSupport，必须设置静态资源，否则swagger、springbootAdmin监控等静态资源无法访问
     *
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
