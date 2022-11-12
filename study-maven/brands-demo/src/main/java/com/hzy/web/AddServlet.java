package com.hzy.web;

import com.hzy.pojo.Brand;
import com.hzy.service.BrandService;
import com.hzy.util.UTIL;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String brandName = UTIL.luanMa(request.getParameter("brandName"));
            String companyName = UTIL.luanMa(request.getParameter("companyName"));
            int ordered = Integer.parseInt(request.getParameter("ordered"));
            String description = UTIL.luanMa(request.getParameter("description"));
            int status = Integer.parseInt(request.getParameter("status"));
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setStatus(status);
        BrandService brandService = new BrandService();
        brandService.addBrand(brand);
        response.sendRedirect("/brands-demo/SelectAllServlet");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
