package com.hzy.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)//只允许注解在方法上面
@Retention(RetentionPolicy.RUNTIME)//注解在源码阶断，编译阶段，运行阶段都存在
public @interface MyLog {
}
