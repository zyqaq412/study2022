package time_10_21.chaRu;

/**
 * @title: ChaRuPaiXu
 * @Author zxwyhzy
 * @Date: 2022/10/21 17:20
 * @Version 1.0
 */
public class ChaRuPaiXu {
    public static void main(String[] args) {
        int[] arr = {10,25,4,7,16,45,78,2,9};
        insertSort(arr);
    }
    //插入排序
    public static void insertSort(int[] arr){
        int insertVal;
        int insertIndex;
        for (int i =1 ;i<arr.length;i++){
            insertVal = arr[i];//插入的数
            insertIndex = i-1;//插入的数前面一个数，也就是开始比较的数 的下标
            while (insertIndex >=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1 ] = insertVal;//插入数的位置是 insertIndex+1

        }
        for (int i : arr) {
            System.out.print(i+"\t");
        }

    }
}
