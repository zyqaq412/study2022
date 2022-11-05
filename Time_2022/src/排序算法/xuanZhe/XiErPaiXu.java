package 排序算法.xuanZhe;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: XiErPaiXu
 * @Author zxwyhzy
 * @Date: 2022/10/22 13:39
 * @Version 1.0
 */
public class XiErPaiXu {
    public static void main(String[] args) {
        //int[] arr = {8,9,1,7,2,3,5,4,6,0};
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-M-d H:m:s");
        
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i]= (int) (Math.random() * 8000000);
        }
        
        Date date1 = new Date();
        String time1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是:" + time1);
        shellSort(arr);  //5 秒
        Date date2 = new Date();
        String time2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是:" + time2);


        Date date11 = new Date();
        String time11 = simpleDateFormat.format(date11);
        System.out.println("排序前的时间是:" + time11);
        shellSort2(arr); // 不到1秒
        Date date22 = new Date();
        String time22 = simpleDateFormat.format(date22);
        System.out.println("排序后的时间是:" + time22);
    }

    /**
     * 希尔排序 （插入排序的一种）
     * 交换法
     * @param arr
     */
    public static void shellSort(int[] arr){
        //定义中间变量用于数据交换
        int tmp;
        for(int gap = arr.length / 2;gap>0;gap /= 2){//控制分组 次数
            for (int i = gap; i < arr.length; i++) {//循环每一组
                for (int j = i - gap; j >=0; j -= gap) {//循环每组的每一个数据
                    if(arr[j] > arr[j+gap]){
                        tmp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = tmp;
                    }
                }
            }
        }
        /*for(int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();*/

    }

    /**
     * 移位法
     * @param arr
     */
    public static void shellSort2(int[] arr){
        int tmp;
        for(int gap = arr.length / 2;gap>0;gap /= 2){
            for (int i = gap;i<arr.length;i++){
                int j = i;
                tmp = arr[j];
                while (j-gap>=0 && tmp < arr[j-gap]){
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = tmp;
                /*if (arr[j] < arr[j-gap]){
                    while (j-gap>=0 && tmp < arr[j-gap]){
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    arr[j] = tmp;
                }*/

            }
        }
        /*for(int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();*/
    }
}

