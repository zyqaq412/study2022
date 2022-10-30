package time_10_23.GuiBing;



/**
 * @title: GuiBingPaiXu
 * @Author zxwyhzy
 * @Date: 2022/10/30 21:47
 * @Version 1.0
 */
public class GuiBingPaiXu {
    public static void main(String[] args) {
        int[] arr ={8,4,5,7,1,3,6,2};
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        for (int i : arr) {
            System.out.print(i+"\t");
        }

    }
    public static void mergeSort(int[] arr,int first,int last,int[] temp){
        if (first<last){
            int mid = (first+last)/2;
            //向左递归分解
            mergeSort(arr,first,mid,temp);
            //向右递归分解
            mergeSort(arr,mid+1,last,temp);

            merge(arr,first,mid,last,temp);

        }
    }

    /**
     *
     * @param arr 需要排序的数组
     * @param first 左边有序数组的初始索引
     * @param mid 中间索引
     * @param last 最右边的索引
     * @param temp 中转数组
     */
    public static void merge(int arr[],int first,int mid,int last,int temp[]){
        int i = first;//左边有序序列的初始索引
        int j = mid+1;//右边有序序列的初始索引
        int t = 0;//中转数组的当前索引

        //将左右两边的数据填充到中转数组去，直到有一边结束为止
        while (i<=mid && j<=last){
            if (arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            } else {
                temp[t++] =arr[j++];
            }
        }
        while (i<=mid){
            temp[t++] = arr[i++];
        }
        while (j<=last){
            temp[t++] = arr[j++];
        }
        t=0;
        while (first <= last){
            arr[first++] = temp[t++];
        }
    }

}
