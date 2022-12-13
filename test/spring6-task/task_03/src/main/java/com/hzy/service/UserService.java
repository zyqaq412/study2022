package com.hzy.service;

import com.hzy.dao.UserDao;

/**
 * @title: UserService
 * @Author zxwyhzy
 * @Date: 2022/12/14 0:03
 * @Version 1.0
 */
public class UserService {
    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void login(){
        userDao.login();

    }}
