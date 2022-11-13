package com.hzy.servlet.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/a")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //发送cookie
        //1.获取cookie对象
        //Cookie cookie = new Cookie("username\n","zs");
        //Cookie cookie = new Cookie("username\n","张三");//存中文会报错
        String value = "张三";
        value=URLEncoder.encode(value,"UTF-8");
        System.out.println("value :"+value);
        Cookie cookie = new Cookie("username",value);

        //设置存活时间
        cookie.setMaxAge(60*60*24*7);
        //2.发送cookie
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
