package com.hzy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

/**
 * @title: SpringMvcConfig
 * @Author zxwyhzy
 * @Date: 2022/11/21 8:54
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.hzy.controller")
//@EnableWebMvc
@Import(SpringMvcSupport.class)
public class SpringMvcConfig {
}
