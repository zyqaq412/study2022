package com.hzy.service;

import com.hzy.dao.BookDao;

/**
 * @title: BookService
 * @Author zxwyhzy
 * @Date: 2022/12/14 0:03
 * @Version 1.0
 */
public class BookService {
    BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public void buy(){
        bookDao.buy();
    }
}
