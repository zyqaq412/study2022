package com.hzy.web;

import com.hzy.pojo.Brand;
import com.hzy.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectAllServlet")
public class SelectAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BrandService bs = new BrandService();
        List<Brand> brands = bs.selectAll();
        for (int i = 0; i < brands.size(); i++) {
            System.out.println(brands.get(i));
        }
        request.setAttribute("brands",brands);
        request.getRequestDispatcher("main.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
