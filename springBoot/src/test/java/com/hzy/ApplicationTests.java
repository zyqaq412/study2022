package com.hzy;

import com.hzy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.soap.Addressing;

@SpringBootTest
class ApplicationTests {
    @Autowired
    BookService bookService;
    @Test
    public void save() {
        bookService.save();
    }

}
