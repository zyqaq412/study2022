package com.hzy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: ServletDemo02
 * @Author zxwyhzy
 * @Date: 2022/11/9 21:12
 * @Version 1.0
 */
@WebServlet("/demo2")

/*
 * @Date: 2022/11/9 21:21
 * request对象
 *      继承体系
 *          ServletRequest java提供的请求对象根接口
 *          HttpServletRequest java提供的对Http协议封装的请求对象接口
 *          RequestFacade Tomcat定义的实现类
 *      获取请求数据
 *          请求行：GET/request-demo/req1?name=hzy HTTP/1.1
 *              String getMethod(); 获取请求方式  GET
 *              String getContextPath();获取虚拟目录(项目访问路径) request-demo
 *              StringBuffer getRequestURL();获取URL(统一资源定位符) http://localhost:8080/request-demo/req1
 *              String getRequestURI();获取URL(统一资源标识符)/request-demo/req1
 *              String getQueryString();获取请求参数(GET方式)：name=hzy
 *          请求头：
 *              String getHeader(String name):根据请求头的名称获取值
 *          请求体：
 *              ServletInputStream getInputStream();获取字节输入流
 *              BufferedReader getReader();获取字符输入流
 *
 *
 */



public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过request对象 获取请求数据
        String name = request.getParameter("name");//url?name=zhangsan

        //使用response 设置响应数据
        //响应头
        response.setHeader("content-type","text/html;charset=utf-8");
        //响应内容
        response.getWriter().write("<h1>"+name+"，欢迎你！</h1>");
    }
}
