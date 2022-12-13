package com.hzy.pojo;

import java.util.Date;

/**
 * @title: Data3
 * @Author zxwyhzy
 * @Date: 2022/12/14 1:34
 * @Version 1.0
 */
public class Data3 {
    Season season;
    Class aClass;
    Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "Data3{" +
                "season=" + season +
                ", aClass=" + aClass +
                ", date=" + date +
                '}';
    }
}
