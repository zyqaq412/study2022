package com.hzy.servlet;

import com.hzy.mapper.UserMapper;
import com.hzy.pojo.User;
import com.hzy.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/longin")
public class LonginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contextPath = request.getContextPath();
        System.out.println(contextPath);

        //接收用户名密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //1.加载mybatis的核心配置文件，获取sqlSessionFactory
        //抽一个工具类，不用每次都写
        /*String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();


        //2.获取sqlSessionFactory对象 用它执行sql语句
        //每个用户一个连接，所以 sqlSession 的获取不能抽取到工具类中
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3 获取UserMapper接口的代理对象 执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user =  userMapper.select(username,password);

        //4.释放资源
        sqlSession.close();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();



        if (user != null){
            //登录成功
            writer.write("<h1>登录成功</h1>");
        }else {
            //登录失败
            writer.write("<h1>登录失败</h1>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
