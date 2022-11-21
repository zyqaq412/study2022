package com.hzy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @title: SpringMvcConfig
 * @Author zxwyhzy
 * @Date: 2022/11/20 19:46
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.hzy.controller","com.hzy.config"})
@EnableWebMvc//开启json转为对象的功能
public class SpringMvcConfig {
}
