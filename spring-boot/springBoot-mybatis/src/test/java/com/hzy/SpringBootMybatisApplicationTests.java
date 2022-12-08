package com.hzy;

import com.hzy.dao.BookDao;
import com.hzy.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    BookDao bookDao;
    @Test
    void contextLoads() {
        Book byId = bookDao.getById(1);
        System.out.println(byId);
    }

}
