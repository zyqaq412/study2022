package com.hzy.domain;

/**
 * @title: User
 * @Author zxwyhzy
 * @Date: 2022/11/20 21:21
 * @Version 1.0
 */
public class User {
    private String name;
    private int age;

    private Addr addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
