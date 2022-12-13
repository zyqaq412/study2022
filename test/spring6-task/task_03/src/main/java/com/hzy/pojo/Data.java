package com.hzy.pojo;

/**
 * @title: Data
 * @Author zxwyhzy
 * @Date: 2022/12/14 0:37
 * @Version 1.0
 */
public class Data {
    int i;
    double d;
    char c;
    float f;
    short s;
    byte b;
    long l;
    boolean flag;

    public void setI(int i) {
        this.i = i;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setS(short s) {
        this.s = s;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public void setL(long l) {
        this.l = l;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "Data{" +
                "i=" + i +
                ", d=" + d +
                ", c=" + c +
                ", f=" + f +
                ", s=" + s +
                ", b=" + b +
                ", l=" + l +
                ", flag=" + flag +
                '}';
    }
    public Data() {
    }
    public Data(boolean flag) {
        this.flag = flag;
    }
    public Data(double d, char c) {
        this.d = d;
        this.c = c;
    }
}
