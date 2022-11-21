package com.hzy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @title: SpringConfig
 * @Author zxwyhzy
 * @Date: 2022/11/20 20:23
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.hzy.service","com.hzy.dao"})//两种过滤，不让spring加载controller的bean
/*@ComponentScan(value = "com.hzy",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)*/
public class SpringConfig {
}
