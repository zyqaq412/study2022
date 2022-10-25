package time_10_23.KuaiShu;

import java.util.Calendar;

/**
 * @title: KuaiShuPaiXu
 * @Author zxwyhzy
 * @Date: 2022/10/23 16:13
 * @Version 1.0
 */
public class KuaiShuPaiXu {
    public static void main(String[] args) {
        //int[] arr = new int[]{6,1,2,7,9,3,4,5,10,8};
        //int[] arr = new int[]{1,2,3,4,5};

        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i]= (int) (Math.random() * 8000000);
        }
        long timeTest1 = Calendar.getInstance().getTimeInMillis();
        questSort(arr,0,arr.length-1);
        long timeTest2 = Calendar.getInstance().getTimeInMillis();
        System.out.println((timeTest2-timeTest1)/1000);
        /*for (int i : arr) {
            System.out.print(i+"\t");
        }*/
    }

    static void questSort(int[]arr,int left,int right){
        if (left>right)return;
        int l =left;
        int r = right;
        int temp = arr[left];
        while (l!=r){
            while (arr[r]>=temp&&r>l){
                r--;
            }
            while (arr[l]<=temp&&r>l){
                l++;
            }
            if(r > l){
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }

        }
        arr[left] = arr[l];
        arr[l] = temp;
        questSort(arr, left, l-1);
        questSort(arr, l+1, right);
    }
}
