package time_10_22;

/**
 * @title: test04
 * @Author zxwyhzy
 * @Date: 2022/10/23 11:55
 * @Version 1.0
 */
import java.util.*;
public class test04{
    static String dontlike = "dontlike";
    static String hate = "hate";
    static String dislike = "dislike";
    static String distinguishing = "distinguishing";

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String str = s.substring(0,a);
        System.out.println(fanZhuan(a, str));
        //System.out.println(s.indexOf("d",0));
    }

    /**
     *
     * @param old 需要替换的字符首字母
     * @param New 替换成的字符
     * @param str 输入的字符串
     * @param yuan 需要替换的字符
     * @return 替换后的字符串
     */
    static String biJiao(String old,String New,String str,String yuan){
        int index = 0;
        while (index<str.length()){
            index = str.indexOf(old, index);
            if (-1 != index){
                String s = "";
                int a =index+yuan.length();
                if (a <= str.length()){
                   s = str.substring(index,a);
                }else break;

                if (s.equalsIgnoreCase(yuan)){
                   str = str.replaceAll(s,New);
                    index +=New.length();
                }else index++;
            }else break;
        }
        return str;
    }
    private static String gsh(String str1) {
        String[] s1 = str1.split(" ");
        String str ="";
        for (int i = 0; i < s1.length; i++) {
            str += s1[i];
        }
        return str;
    }
    public static String fanZhuan(int a,String str1){
        String str = gsh(str1);

        str = biJiao("d","like",str,dontlike);
        str = biJiao("D","like",str,dontlike);

        str = biJiao("h","love",str,hate);
        str = biJiao("H","love",str,hate);

        str = biJiao("d","like",str,dislike);
        str = biJiao("D","like",str,dislike);


        str = biJiao("d","exciting",str,distinguishing);
        str = biJiao("D","exciting",str,distinguishing);

        return str;
    }

    /*Scanner sc =new Scanner(System.in);
    int a = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    String str = s.substring(0,a);

        if(str.contains("dontlike"))str= str.replaceAll("dontlike","like");
        if(str.contains("hate"))str= str.replaceAll("hate","love");
        if(str.contains("dislike"))str= str.replaceAll("dislike","like");
        if(str.contains("distinguishing"))str= str.replaceAll("distinguishing","exciting");

        System.out.println(str);*/


}