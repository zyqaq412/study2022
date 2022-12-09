package com.hzy;

import com.hzy.service.UserService;
import org.aspectj.lang.annotation.Around;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomAnnotationApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        userService.login("zs","123");
        userService.add();
    }

}
