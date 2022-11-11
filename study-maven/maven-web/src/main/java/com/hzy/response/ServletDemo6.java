package com.hzy.response;



import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/demo6")
public class ServletDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * @Date: 2022/11/11 12:50
         * 响应字节数据
         */
        //1.读取文件
        FileInputStream fis = new FileInputStream("D:\\code\\study2022\\study-maven\\maven-web\\src\\main\\java\\com\\hzy\\response\\1.jpg");

        //2.获取字节输出流

        ServletOutputStream os = response.getOutputStream();
        //3.完成copy
        //这样写很复杂
        //在pom.xml 引入commons-io
        /*byte[] buff = new byte[1024];
        int len = 0;
        while ((len = fis.read(buff))!=-1){
            os.write(buff,0,len);
        }*/
        IOUtils.copy(fis,os);

        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
