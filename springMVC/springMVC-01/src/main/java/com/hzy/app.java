package com.hzy;

import com.hzy.config.SpringConfig;
import com.hzy.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @title: app
 * @Author zxwyhzy
 * @Date: 2022/11/20 20:33
 * @Version 1.0
 */
public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = ctx.getBean(UserController.class);
        System.out.println(bean);
    }
}
