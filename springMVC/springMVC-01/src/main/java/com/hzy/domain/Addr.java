package com.hzy.domain;

/**
 * @title: Addr
 * @Author zxwyhzy
 * @Date: 2022/11/20 21:24
 * @Version 1.0
 */
public class Addr {
   private String city;
   private String province;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "Addr{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
