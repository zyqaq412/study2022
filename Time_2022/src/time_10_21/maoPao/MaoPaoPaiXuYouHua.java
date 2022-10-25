package time_10_21.maoPao;

/**
 * @title: MaoPaoPaiXuYouHua
 * @Author zxwyhzy
 * @Date: 2022/10/21 12:34
 * @Version 1.0
 */
public class MaoPaoPaiXuYouHua {
    public static void main(String[] args) {
        int[] a = {3,9,-1,10,20};//优化前比较12次,优化后比较9次
        int cont = 0;
        boolean flag ;//
        for (int i = 0; i < a.length-1; i++) {
            flag = false;
            for (int j = 0; j < a.length-1 - i; j++) {
                cont++;
                if (a[j] > a[j+1]){
                    flag = true;

                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= tmp;
                }
            }
            if (flag == false){//判断本次循环是否交换位置，没交换说明数组已经有序，提前结束循环
                break;
            }
        }
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.printf("\n %d",cont);//9
    }
}
