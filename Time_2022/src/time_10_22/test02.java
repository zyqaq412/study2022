package time_10_22;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @title: test02
 * @Author zxwyhzy
 * @Date: 2022/10/22 23:45
 * @Version 1.0
 */
public class test02 {
    public static void main(String[] args) throws Exception{
        countPrimes();
        //System.out.println(countPrimes1(2));
    }
    public static void  countPrimes() throws Exception{
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int l  ;
        int r  ;
        StringBuffer bw =new  StringBuffer();
        for (int k = 0 ; k< m ; k++){
            l = sc.nextInt();
            r = sc.nextInt();

          bw.append(countPrimes1(r+1,l)+"\n");
        }
        System.out.println(bw);
        sc.close();


    }
    public static int countPrimes1(int n,int x) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++)
            if (isPrim[i])
                for (int j = i * i; j < n; j += i)
                    isPrim[j] = false;

        int count = 0;
        for (int i =Math.max(x,2) ; i < n; i++)
            if (isPrim[i]) count++;

        return count;
    }



}
