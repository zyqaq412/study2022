package com.hzy.domain;

/**
 * @title: Book
 * @Author zxwyhzy
 * @Date: 2022/11/20 21:46
 * @Version 1.0
 */
public class Book {
    private String name;
    private double yuan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYuan() {
        return yuan;
    }

    public void setYuan(double yuan) {
        this.yuan = yuan;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", yuan=" + yuan +
                '}';
    }
}
