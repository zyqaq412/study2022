package com.hzy.service.impl;

import com.hzy.dao.BookDao;
import com.hzy.domain.Book;
import com.hzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title: BookServiceImpl
 * @Author zxwyhzy
 * @Date: 2022/11/21 9:08
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        ;
        return bookDao.save(book) >0;
    }

    @Override
    public boolean update(Book book) {

        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookDao.getAll();
        return books;
    }
}
