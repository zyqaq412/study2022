package com.hzy;

import com.hzy.Brand;
import com.hzy.util.UTIL;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo1")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");//设置请求字符编码
        response.setContentType("text/html;charset=utf-8");//设置响应字符编码

        String username = UTIL.luanMa(request.getParameter("username"));
        System.out.println(username);


        //1. 准备数据
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"三只松鼠","三只松鼠",100,"三只松鼠，好吃不上火",1));
        brands.add(new Brand(2,"优衣库","优衣库",200,"优衣库，服适人生",0));
        brands.add(new Brand(3,"小米","小米科技有限公司",1000,"为发烧而生",1));


        //2. 存储到request域中
        request.setAttribute("brands",brands);
        request.setAttribute("status",1);

        response.getWriter().write("黄哲宇");
        //3. 转发到 el-demo.jsp
        //request.getRequestDispatcher("/el-demo.jsp").forward(request,response);
        //request.getRequestDispatcher("/jstl-if.jsp").forward(request,response);
        request.getRequestDispatcher("/jstl-foreach.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}