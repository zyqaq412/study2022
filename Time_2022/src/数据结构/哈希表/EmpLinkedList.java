package 数据结构.哈希表;

/**
 * @title: EmpLinkedList
 * @Author zxwyhzy
 * @Date: 2022/11/6 22:25
 * @Version 1.0
 *
 * Emp 链表
 */
public class EmpLinkedList {
    Emp head = null;//头指针 指向第一个Emp

    /*
     * @Date: 2022/11/6 22:28
     * 添加雇员
     * 1.假定，添加雇员时，id是自增的
     * 因此我们直接将元素加到最后
     */
    public void add(Emp emp){
        if (head == null){
            head = emp;
            return;
        }
        //如果不是第一个，那定义一个辅助指针向后查找
        Emp temp =head;
        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = emp;
    }

    //遍历雇员信息
    public void list(){
        if (head ==null) System.out.println("当前链表为空");
        System.out.println("当前链表信息为：");
        Emp temp = head;
        while (temp !=null){
            System.out.printf("id:%d 姓名:%S\n",temp.id,temp.name);
            temp = temp.next;
        }
    }
}
