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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收用户数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //封装用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        //1.获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        //2.获取sqlSessionFactory对象 用它执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3 获取UserMapper接口的代理对象 执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User u =  userMapper.selectByUserName(username);

        if (u == null){
            //用户存在
            userMapper.add(user);
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }else {
            //用户不存在
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("用户名已存在");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
