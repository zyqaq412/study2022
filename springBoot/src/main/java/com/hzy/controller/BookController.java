package com.hzy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: BookController
 * @Author zxwyhzy
 * @Date: 2022/11/21 16:53
 * @Version 1.0
 */
@RestController
@RequestMapping("books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id---->"+id);
        return "hello springBoot";
    }
}
