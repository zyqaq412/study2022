package 查找算法;

import java.util.ArrayList;
import java.util.List;

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
        int[] arr2 = new int[]{1,8,10,89,89,89,123,566};
        ArrayList<Integer> list = search3(arr2,findNumber,0,arr2.length-1);
        System.out.println(list);
    }
    /*
     * @Date: 2022/11/5 22:51
     * 如果有多个相同元素怎么返回所有元素的位置
     */
    public static ArrayList<Integer> search3(int[] arr, int findNumber, int left, int right){
        //二分查找要有序数组
        if (left>right)return new ArrayList<Integer>();
        int mid = (left+right)/2;
        if (arr[mid] > findNumber){
            return  search3(arr,findNumber,left,mid-1);
        }else if (arr[mid] < findNumber){
            return search3(arr,findNumber,mid+1,right);
        }else{
            //最终的返回在这里
            //所有只要在这里将找到的位置加入集合再向左向右找
            ArrayList<Integer> list = new ArrayList();

            int temp = mid - 1;//向左查找
            while (true){
                if (temp < 0 || arr[temp]!=findNumber){
                    break;
                }
                list.add(temp--);
            }
            list.add(mid);
            temp = mid + 1;//向右查找
            while (true){
                if (temp >= arr.length || arr[temp]!=findNumber){
                    break;
                }
                list.add(temp++);
            }
            return list;
        }

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
        }else{
            return mid;
        }

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
