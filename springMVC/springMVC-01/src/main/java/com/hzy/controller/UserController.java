package com.hzy.controller;

import com.hzy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @title: UserController
 * @Author zxwyhzy
 * @Date: 2022/11/20 19:42
 * @Version 1.0
 */
/*@Controller
@ResponseBody*/
@RestController//==@Controller,@ResponseBody
@RequestMapping("/users")
public class UserController {

    //RESTful
    //@RequestMapping(value = "users",method = RequestMethod.POST)
    @PostMapping
    //@ResponseBody
    public String save(){//增
        System.out.println("user save");
        return "user save";
    }
    //@RequestMapping(value = "users",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping
    public String select(){//查
        System.out.println("user select");
        return "user select";
    }

    //@RequestMapping(value = "users/{id}",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/{id}")
    public String selectById(@PathVariable Integer id){//查
        System.out.println("查找id："+id);
        return "user select";
    }

    //@RequestMapping(value = "users/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    //@ResponseBody
    public String delete(@PathVariable/*表示参数来自路径*/ Integer id){
        System.out.println("user delete :"+id);
        return "user delete";
    }

    //@RequestMapping(value = "users/{id}",method = RequestMethod.PUT)
    //@ResponseBody
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id){
        System.out.println("user update :"+id);
        return "user update";
    }
/*
    @RequestMapping("up2")
    @ResponseBody
    public String up2(@RequestParam List<String> likes){
        System.out.println(likes);
        return "user save";
    }
    @RequestMapping("up1")
    @ResponseBody
    public String up1(String[] likes){
        for (String like : likes) {
            System.out.println(like);
        }
        return "user save";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(User user){
        System.out.println("name =>" +user);
        return "user save";
    }

    @RequestMapping("save")
    @ResponseBody
    public String save(){
        System.out.println("user save");
        return "user save";
    }
    @RequestMapping("select")
    @ResponseBody
    public String select(){
        System.out.println("user select");
        return "user select";
    }*/
}
