package com.hzy.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @title: BookDao
 * @Author zxwyhzy
 * @Date: 2022/12/13 23:42
 * @Version 1.0
 */
public class BookDao {


    public void buy (){
        // 你自己怎么去使用log4j2记录日志信息呢？
        // 第一步：创建日志记录器对象
        // 获取FirstSpringTest类的日志记录器对象，也就是说只要是FirstSpringTest类中的代码执行记录日志的话，就输出相关的日志信息。
        Logger logger = LoggerFactory.getLogger(BookDao.class);

        // 第二步：记录日志，根据不同的级别来输出日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");
        System.out.println("买书");
    }
}
