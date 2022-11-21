package com.hzy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @title: SpringMvcSupport
 * @Author zxwyhzy
 * @Date: 2022/11/20 23:10
 * @Version 1.0
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问 /pages/???的时候，走/pages目录下的内容
        //registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        //registry.addResourceHandler("/aa/**").addResourceLocations("/aa/");
    }
    @Override

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable();;

    }

}

