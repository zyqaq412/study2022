package 查找算法;

/**
 * @title: BinarySearch
 * @Author zxwyhzy
 * @Date: 2022/11/5 22:05
 * @Version 1.0
 *
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,10,89,123,566};
        int findNumber = 89;
        int i = search(arr,findNumber);
        int j = search2(arr,findNumber,0,arr.length-1);
        System.out.println(i);
        System.out.println(j);
    }
    //递归查找
    public static int search2(int[] arr,int findNumber,int left,int right){
        //二分查找要有序数组
        if (left>right)return -1;
        int mid = (left+right)/2;
        if (arr[mid] > findNumber){
            return  search2(arr,findNumber,left,mid-1);
        }else if (arr[mid] < findNumber){
            return search2(arr,findNumber,mid+1,right);
        }else if (arr[mid]==findNumber){

            return mid;
        }
        return -1;
    }

    //循环查找
    public static int search(int[] arr,int findNumber){
        //二分查找要有序数组
        int l = 0;
        int r = arr.length-1;
        int mid ;
        while (!(l>r)){
            mid = (l+r)/2;
            if (arr[mid] > findNumber){
                r=mid-1;
            }else if (arr[mid]<findNumber){
                l=mid+1;
            }else if (arr[mid]==findNumber){
                return mid;
            }else {
                return -1;
            }
        }
        return -1;

    }
}
