package 数据结构.哈希表;

/**
 * @title: HashTableDemo
 * @Author zxwyhzy
 * @Date: 2022/11/6 22:58
 * @Version 1.0
 */
public class HashTableDemo {
    EmpLinkedList[]  empLinkedListArray;

    public HashTableDemo(int size) {
        empLinkedListArray = new EmpLinkedList[size];
    }
    public void add(Emp emp){
        int i= hashFun(emp);
        if (empLinkedListArray[i] == null){
            empLinkedListArray[i] = new EmpLinkedList();
        }
        empLinkedListArray[i].add(emp);
    }
    public void list(){
        for (int i=0;i<empLinkedListArray.length;i++){
            empLinkedListArray[i].list();
        }
    }
    //编写散列函数，使用一个简单取模法
    public int hashFun(Emp emp){
        return emp.id%empLinkedListArray.length;
    }
}
