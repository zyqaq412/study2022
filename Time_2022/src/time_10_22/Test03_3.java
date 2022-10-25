package time_10_22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @title: Test03_3
 * @Author zxwyhzy
 * @Date: 2022/10/23 23:17
 * @Version 1.0
 */
public class Test03_3 {
    final static int MAX = 10000000;
    public static void main(String[] args) {
        int[] arr = countPrimes(MAX+1);

        //Scanner sc =new Scanner(System.in);
        Test03_2.Input sc = new Test03_2.Input();
        int m = sc.nextInt();
        int l  ;
        int r  ;
        StringBuffer bw =new  StringBuffer();
        for (int k = 0 ; k< m ; k++){
            l = sc.nextInt();
            r = sc.nextInt();

            bw.append(count(arr,l,r)+"\n");
        }
        System.out.println(bw);

    }
    public static int count (int[] arr,int l,int r){
        int count = 0;
        for (int i = Math.max(2,l); i <= r; i++) {
            if (arr[i]==1){
                count++;
            }
        }
        return count;
    }
    public static int[] countPrimes(int n) {
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
        return isPrime;
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






}
