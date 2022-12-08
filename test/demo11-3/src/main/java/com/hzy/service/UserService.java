package com.hzy.service;


import com.hzy.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @title: UserService
 * @Author zxwyhzy
 * @Date: 2022/12/8 21:01
 * @Version 1.0
 */

public interface UserService {
    boolean login(User user);
}
