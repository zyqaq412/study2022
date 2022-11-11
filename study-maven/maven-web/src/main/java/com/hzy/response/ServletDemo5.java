package com.hzy.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo5")
public class ServletDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * @Date: 2022/11/11 12:39
         * 响应字符数据
         */
        //设置输出流的格式和字符集
        response.setContentType("text/html;charset=utf-8");
        //通过response对象获取字符输出流
        PrintWriter out = response.getWriter();
        //写数据
        out.print("<h1>hello servlet! 黄哲宇</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
