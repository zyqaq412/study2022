package 数据结构.树.二叉树;

/**
 * @title: ArrBinaryTreeDemo
 * @Author zxwyhzy
 * @Date: 2022/11/10 12:41
 * @Version 1.0
 * 顺序存储二叉树
 */
public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        new ArrBinaryTree(arr).perOrder(0);
        System.out.println();
        new ArrBinaryTree(arr).perOrder2(0);
    }
}
//编写一个ArrBinaryTree，实现顺序存储二叉树遍历
class ArrBinaryTree{
    private int[] arr;//存储数据结点的数组

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }
    //编写一个方法，完成顺序存储二叉树的前序遍历
    public void perOrder(int index){
        if (arr==null || arr.length==0) System.out.println("数组为空");
        //输出当前元素
        System.out.print(arr[index]+" ");
        //向左遍历
        if (index*2+1<arr.length)perOrder(2*index+1);
        //向右递归
        if (index*2+2<arr.length)perOrder(2*index+2);
    }
    //编写一个方法，完成顺序存储二叉树的中序遍历
    public void perOrder2(int index){
        if (arr==null || arr.length==0) System.out.println("数组为空");
        //向左遍历
        if (index*2+1<arr.length)perOrder2(2*index+1);
        //输出当前元素
        System.out.print(arr[index]+" ");
        //向右递归
        if (index*2+2<arr.length)perOrder2(2*index+2);
    }
}
