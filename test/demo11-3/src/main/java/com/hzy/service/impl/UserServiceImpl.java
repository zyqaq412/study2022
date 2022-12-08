package com.hzy.service.impl;

import com.hzy.dao.UserDao;
import com.hzy.pojo.User;
import com.hzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title: UserServiceImpl
 * @Author zxwyhzy
 * @Date: 2022/12/8 21:03
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public boolean login(User user) {
        User user1 = userDao.select(user);
        if (user1 != null) return true;
        else return false;
    }
}
