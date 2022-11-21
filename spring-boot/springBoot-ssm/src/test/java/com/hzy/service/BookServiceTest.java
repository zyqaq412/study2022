package com.hzy.service;

import com.hzy.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import org.junit.jupiter.api.Test;


import java.util.List;

/**
 * @title: BookServiceTest
 * @Author zxwyhzy
 * @Date: 2022/11/21 9:34
 * @Version 1.0
 */

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)*/
@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }
    @Test
    public void testGetAll(){
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}
