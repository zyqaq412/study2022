package com.hzy.pojo;

/**
 * @title: Data2
 * @Author zxwyhzy
 * @Date: 2022/12/14 1:08
 * @Version 1.0
 */
public class Data2 {
    String string;
    Integer integer;
    Boolean aBoolean;

    public Data2() {
    }

    public Data2(Integer integer) {
        this.integer = integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Data2(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                ", aBoolean=" + aBoolean +
                '}';
    }
}
