package time_10_22;

/**
 * @title: test5
 * @Author zxwyhzy
 * @Date: 2022/10/23 21:12
 * @Version 1.0
 */
import java.io.*;
import java.util.*;
public class test5{
    private final static int MAX= 10000000;
    private  static int count=0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new BufferedInputStream(System.in);
        InputReader reader = new InputReader(inputStream);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] cnt = new int[MAX+1];
        int m=reader.nextInt();
        primer(cnt);
        for(int i=0;i<m;i++){
            int l= reader.nextInt();
            int r= reader.nextInt();
//            System.out.println(l+" "+r);
            writer.write(cnt[r]-cnt[l-1]+"\n");
        }
        writer.close();
    }


    private static void primer(int[] cnt){
        boolean[] st = new boolean[MAX+1];
        for(int i=2;i<=MAX;i++){
            cnt[i]=cnt[i-1];
            if(st[i]) {
                continue;
            }
            cnt[i]++;
            for(int j=i;j<=MAX;j+=i){
                st[j]=true;
            }
        }
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }


        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}