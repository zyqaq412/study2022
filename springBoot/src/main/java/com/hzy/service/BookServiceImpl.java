package com.hzy.service;

import org.springframework.stereotype.Service;

/**
 * @title: BookServiceImpl
 * @Author zxwyhzy
 * @Date: 2022/11/21 23:12
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService
{
    @Override
    public void save() {
        System.out.println("book service save");
    }
}
