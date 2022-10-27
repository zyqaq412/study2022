package com.hzy.test;

import com.hzy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @title: MyBatisDemo
 * @Author zxwyhzy
 * @Date: 2022/10/26 21:22
 * @Version 1.0
 */
public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        //1.加载mybatis的核心配置文件，获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSessionFactory对象 用它执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql
        List<User> users = sqlSession.selectList("test.selectAll");
        System.out.println(users);

        //4.释放资源
        sqlSession.close();

    }
}
