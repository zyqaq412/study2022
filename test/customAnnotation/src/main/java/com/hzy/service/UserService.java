package com.hzy.service;

import com.hzy.annotation.MyLog;
import org.springframework.stereotype.Service;

/**
 * @title: UserService
 * @Author zxwyhzy
 * @Date: 2022/12/9 20:03
 * @Version 1.0
 */
@Service
public class UserService {
    @MyLog
    public boolean login(String username,String password ){
        try {
            Thread.sleep(1000);
            System.out.println("登录成功");
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @MyLog
    public void add(){
        try {
            Thread.sleep(1000);
            System.out.println("添加成功");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
