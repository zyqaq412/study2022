package com.hzy.controller;

import com.hzy.domain.Book;
import com.hzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @title: BookController
 * @Author zxwyhzy
 * @Date: 2022/11/21 9:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired//自动装配
    private BookService bookService;




    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);

        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);

        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);

        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book!=null? Code.GET_OK:Code.GET_ERR;
        String msg = book!=null?null:"查询失败，请重试！";

        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books!=null? Code.GET_OK:Code.GET_ERR;
        String msg = books!=null?null:"查询失败，请重试！";

        return new Result(code,books,msg);
    }




    /*@PostMapping
    public boolean save(@RequestBody Book book) {

        return bookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {

        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {

        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {

        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {

        return bookService.getAll();
    }*/
}
