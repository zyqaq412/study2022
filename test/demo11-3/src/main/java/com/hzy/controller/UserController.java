package com.hzy.controller;

import com.hzy.pojo.User;
import com.hzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: UserController
 * @Author zxwyhzy
 * @Date: 2022/12/8 20:53
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping
    public boolean login(@RequestBody User user){
        boolean flag = service.login(user);
        System.out.println(flag);
        return flag;

    }
}
