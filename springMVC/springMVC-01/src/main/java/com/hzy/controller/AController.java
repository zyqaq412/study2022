package com.hzy.controller;

import com.hzy.domain.Addr;
import com.hzy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: AController
 * @Author zxwyhzy
 * @Date: 2022/11/20 22:04
 * @Version 1.0
 */
@Controller
public class AController {

    @RequestMapping("/a")
    @ResponseBody
    public String a(){
        return "aaa.html";
    }
    @RequestMapping("/b")
    @ResponseBody
    public User b(){
        User user = new User();
        user.setAge(12);
        user.setName("hzy");
        user.setAddr(new Addr());

        return user;
    }
}
