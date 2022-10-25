package time_10_21.xuanZhe;

/**
 * @title: XuanZhePaiXu
 * @Author zxwyhzy
 * @Date: 2022/10/21 12:37
 * @Version 1.0
 */
public class XuanZhePaiXu {
    public static void main(String[] args) {
        int[] a = {5,1,25,3,7,19,85,96};
        int min;
        int tmp;
        for (int i = 0; i < a.length-1; i++) {
            //假设起点i下标位置上的元素是最小的
            min = i;
            for (int j = i+1; j < a.length; j++) {

                if (a[min] > a[j]){
                    min = j;
                }
            }
           if (min != i){
                tmp = a[min];
                a[min] =a[i];
                a[i] = tmp;
           }
        }
        for (int i : a) {
            System.out.print(i+"\t");
        }
    }
}
