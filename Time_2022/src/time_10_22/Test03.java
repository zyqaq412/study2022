package time_10_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @title: Test03
 * @Author zxwyhzy
 * @Date: 2022/10/23 11:30
 * @Version 1.0
 */
public class Test03 {
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
        List<Integer> primes = new ArrayList<Integer>();
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                primes.add(i);
            }
            for (int j = 0; j < primes.size() && i * primes.get(j) < n; ++j) {
                isPrime[i * primes.get(j)] = 0;
                if (i % primes.get(j) == 0) {
                    break;
                }
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) < x){
                primes.remove(i);
            }
        }
        return primes.size();
    }
}
