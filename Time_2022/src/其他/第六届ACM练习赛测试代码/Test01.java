package 其他.第六届ACM练习赛测试代码;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title: Test01
 * @Author zxwyhzy
 * @Date: 2022/10/22 22:14
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        CountZhiShu1();
    }
    public static void CountZhiShu1(){
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int l =0 ;
        int r = 0 ;
        String s = "";

        for (int i = 0 ; i< m ; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            boolean[] isPrim = new boolean[r];
            // 将数组都初始化为 true
            Arrays.fill(isPrim,true);
            for (int j = l ;j<=r;j++){
                if (isZhiShu(j)){

                    for (int k = j*2 ; k<=r;k += j){
                        isPrim[k-1] = false;
                    }
                }else {
                    isPrim[j-1]=false;
                }
            }
            int count = 0;
            for (int z = l-1; z < r; z++){
                if (isPrim[z]==true) count++;
            }
            s = s + count+"\n";
        }
        System.out.println(s);
    }
    public static boolean isZhiShu(int x){
        if (x == 1)return false;
        if (x == 2) return true;
        if (x%2 ==0) return false;
        for (int i = 3 ; i<=(int)Math.sqrt(x);i++){
            if (x%i==0) return false;

        }
        return true;
    }
    /*public static void CountZhiShu(){
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int l =0 ;
        int r = 0 ;
        int conut ;
        for (int i = 0 ; i< m ; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            conut = 0;
            for (int j = l ; j<=r ;j++ ){
                if (isZhiShu(j)){
                    conut++;
                }

            }
            System.out.println(conut);
        }
    }*/
}
