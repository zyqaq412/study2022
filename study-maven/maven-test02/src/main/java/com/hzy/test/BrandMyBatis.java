package com.hzy.test;

import com.hzy.mapper.BrandMapper;
import com.hzy.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @title: BrandMyBatis
 * @Author zxwyhzy
 * @Date: 2022/10/27 23:23
 * @Version 1.0
 */
public class BrandMyBatis {
    public static void main(String[] args) throws IOException {
        //1.加载mybatis的核心配置文件，获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSessionFactory对象 用它执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3 获取UserMapper接口的代理对象 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands= brandMapper.selectAll();
        System.out.println(brands);


        //4.释放资源
        sqlSession.close();
    }

}
