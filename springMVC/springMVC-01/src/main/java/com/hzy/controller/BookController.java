package com.hzy.controller;

import com.hzy.domain.Book;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @title: BookController
 * @Author zxwyhzy
 * @Date: 2022/11/20 20:59
 * @Version 1.0
 */
@Controller
@RequestMapping("book")
public class BookController {


   /* @RequestMapping("json1")
    @ResponseBody
    //public String save(String name){//形参名和请求参数名要相同
    public String json1(@RequestBody List<String> likes){// 或者用注解
        System.out.println(likes);
        return "book save";
    }*/

    @RequestMapping("json1")
    @ResponseBody
    //public String save(String name){//形参名和请求参数名要相同
    public String json1(@RequestBody String jsonStr){// 或者用注解
        System.out.println(jsonStr);
        return "book save";
    }

    @RequestMapping("json2")
    @ResponseBody
    //public String save(String name){//形参名和请求参数名要相同
    public String json2(@RequestBody Book book){// 或者用注解
        System.out.println(book);
        return "book save";
    }

    @RequestMapping("date1")
    @ResponseBody
    //public String save(String name){//形参名和请求参数名要相同
    public String date1(Date date1,
                        @DateTimeFormat(pattern = "y-M-d") Date date2,
                        @DateTimeFormat(pattern = "y/M/d H:m:s") Date date3){// 或者用注解
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        return "book save";
    }

    @RequestMapping("save")
    @ResponseBody
    //public String save(String name){//形参名和请求参数名要相同
    public String save(@RequestParam("name") String name){// 或者用注解
        System.out.println("普通参数传递====》"+ name);
        return "book save";
    }


}
