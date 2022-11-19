package com.hzy;

import com.hzy.config.SpringConfig;
import com.hzy.dao.BookDao;
import com.hzy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: AppForAnnotation
 * @Author zxwyhzy
 * @Date: 2022/11/19 16:16
 * @Version 1.0
 */
public class AppForAnnotation {public static void main(String[] args) {
    //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.bak");
    //加载配置文件
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
    BookDao dao = ctx.getBean(BookDao.class);//根据类型
    //BookService service = ctx.getBean(BookService.class);
    BookService service = (BookService) ctx.getBean("bookService");//根据名字
    //System.out.println(dao);
    //System.out.println(service);
    service.save();
    ctx.close();

}

}
