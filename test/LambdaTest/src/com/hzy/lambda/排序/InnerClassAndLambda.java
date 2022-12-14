package com.hzy.lambda.排序;


import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title: InnerClassAndLambda
 * @Author zxwyhzy
 * @Date: 2022/12/14 14:29
 * @Version 1.0
 */
public class InnerClassAndLambda {

    @Test
    public void test01(){
        String[] names = {"hzy","xy","zxwy"};
        // 匿名内部类实现根据名字长短排序
        // void sort(Object[], Comparator<? super Object>)
        // 传入参数 和一个比较器
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.length()-name2.length();
            }
        });
        // 也可以这样写增强可读性
        Comparator<String> byLength = new Comparator<String>(){
            @Override
            public int compare(String name1, String name2) {
                return name1.length()-name2.length();
            }
        };

        Arrays.sort(names,byLength);

        for (String name : names) {
            System.out.print(name+"\t");
        }
    }
    @Test
    public void test02(){
        // 使用Lambda表达式 简化
        String[] names = {"hzy","xy","zxwy"};

        // Comparator<String> byLength = (String name1, String name2) -> name1.length()-name2.length();
        /*
         public interface Comparator<T> {
             int compare(T o1, T o2);
            }
        */
        // 声明 Comparator<String> byLength 的时候就已经确定了参数的类型 所以Lambda表达式可以省略参数类型
        //Comparator<String> byLength = (name1, name2) -> name1.length()-name2.length();
        // Comparator byLength = (name1, name2) -> name1.length()-name2.length(); 报错

        // Arrays.sort(names,byLength);

        // 如果需要简洁 可以直接将Lambda表达式放在sort()中
        // 编译程序可以从names 推断出 参数类型 所以还是不用指定类型
        Arrays.sort(names,(name1, name2) ->  name1.length()-name2.length());
        for (String name : names) {
            System.out.print(name+"\t");
        }
    }
}
