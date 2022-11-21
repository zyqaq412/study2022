package com.hzy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @title: SpringConfig
 * @Author zxwyhzy
 * @Date: 2022/11/21 8:38
 * @Version 1.0
 */
@Configuration//设置他为配置类
@ComponentScan("com.hzy.service")//扫描
@PropertySource("classpath:jdbc.properties")//导入配置类 classpath:不加这个会报错
@Import({JdbcConfig.class, MybatisConfig.class})//导入配置类
@EnableTransactionManagement//开启事务管理
public class SpringConfig {

}
