package com.hzy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @title: MybatisConfig
 * @Author zxwyhzy
 * @Date: 2022/11/21 8:39
 * @Version 1.0
 */

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.hzy.domain");//类型别名扫描包
        return factoryBean;

    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer (){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.hzy.dao");//映射
        return msc;
    }
}
