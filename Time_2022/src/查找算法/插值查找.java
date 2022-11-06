package 查找算法;

/**
 * @title: 插值查找
 * @Author zxwyhzy
 * @Date: 2022/11/6 21:09
 * @Version 1.0
 */
public class 插值查找 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        int i = insertSearch(arr,101,0,arr.length-1);
        System.out.println(i);

    }

    public static int insertSearch(int[]arr,int findVal,int left,int right){
        if (left>right||findVal>arr[right]||findVal<arr[left])return-1;
        int mid =left+ (right-left)*(findVal-arr[left])/(arr[right]-arr[left]);
        if (arr[mid]>findVal){
            return insertSearch(arr,findVal,left,mid-1);
        }else if (arr[mid]<findVal){
            return insertSearch(arr,findVal,mid+1,right);
        }else {
            return mid;
        }

    }
}
