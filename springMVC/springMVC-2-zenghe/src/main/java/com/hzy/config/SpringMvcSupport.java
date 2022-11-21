package com.hzy.config;

import com.hzy.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


/**
 * @title: SpringMvcSupport
 * @Author zxwyhzy
 * @Date: 2022/11/21 11:36
 * @Version 1.0
 */
public class SpringMvcSupport extends DelegatingWebMvcConfiguration {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(projectInterceptor).addPathPatterns("/books");//这么写拦截不了/books/1
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
    }
}
