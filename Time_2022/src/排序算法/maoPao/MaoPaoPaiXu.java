package 排序算法.maoPao;

/**
 * @title: MaoPaoPaiXu
 * @Author zxwyhzy
 * @Date: 2022/10/21 12:33
 * @Version 1.0
 */
public class MaoPaoPaiXu {
    /*
     *   双层循环时间复杂度o(n^2)
     *
     * */
    public static void main(String[] args) {
        int[] a = {3,9,-1,10,20};
        int cont =0;//记录比较次数
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1 - i; j++) {
                cont++;
                if (a[j] > a[j+1]){
                    cont++;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= tmp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println("\n"+cont);//12
    }
}
