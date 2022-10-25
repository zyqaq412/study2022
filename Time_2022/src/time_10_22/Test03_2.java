package time_10_22;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @title: Test03_2
 * @Author zxwyhzy
 * @Date: 2022/10/23 21:16
 * @Version 1.0
 */
public class Test03_2 {
    final static int MAX = 10000000;
    public static void main(String[] args) {
        int[] arr = new int[MAX+1];
        primer(arr);
        //Scanner sc =new Scanner(System.in);
        Input sc = new Input();
        int m = sc.nextInt();
        int l  ;
        int r  ;
        StringBuffer bw =new  StringBuffer();
        for (int k = 0 ; k< m ; k++){
            l = sc.nextInt();
            r = sc.nextInt();

            bw.append((arr[r]-arr[l-1])+"\n");
        }
        System.out.println(bw);

    }

    private static void primer(int[] cnt){
        boolean[] st = new boolean[MAX+1];//10000001
        //最后数组 cnt[10/9/8] = 4,代表0-10/9/8 之间的质数为4 cnt{0, 0, 1, 2, 2, 3, 3, 4, 4, 4, 4} 质数个数
        //                                                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 下标
        for(int i=2;i<=MAX;i++){
            cnt[i]=cnt[i-1];
            if(st[i]) {
                continue;//终止当前循环，开始下一次循环
            }
            cnt[i]++;
            for(int j=i;j<=MAX;j+=i){
                st[j]=true;
            }
        }
    }

    /**
     * https://blog.csdn.net/m0_62190011/article/details/125240283
     *
     */
    static class Input {//键盘输入 比Scanner快
        BufferedReader buf;//用于键盘读取的缓冲流
        StringTokenizer tok;//字符串解析器，用于分隔字符串。

        Input() {
            buf = new BufferedReader(new InputStreamReader(System.in));
        }

        boolean hasNext() {
            //tok == null 表示tok为空对象，那么就创建一个，并且读取输入的一行作为要被解析的参数
            //!tok.hasMoreElements() 表示tok已经没有数据了，那就重新创建一个
            while (tok == null || !tok.hasMoreElements()) {
                try {
                    tok = new StringTokenizer(buf.readLine());
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
        }

        String next() {
            if (hasNext())
                //tok.nextToken() 返回从当前位置到下一个分隔符的字符串
                return tok.nextToken();
            return null;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        /*
        String nextLine(){
            try {
                return buf.readLine();
            } catch (IOException e) {
                return null;
            }
        }
        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }*/
    }




    /*public static int[] countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {

                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return isPrime;
    }*/


    /*public int countPrimes(int n) {
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
        return primes.size();
    }*/


}
