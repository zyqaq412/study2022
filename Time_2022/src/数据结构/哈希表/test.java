package 数据结构.哈希表;

/**
 * @title: test
 * @Author zxwyhzy
 * @Date: 2022/11/6 23:06
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        HashTableDemo htd = new HashTableDemo(3);
        Emp emp1 = new Emp(1,"h");
        Emp emp2 = new Emp(2,"d");
        Emp emp3 = new Emp(3,"e");
        Emp emp4 = new Emp(4,"rf");
        Emp emp5 = new Emp(5,"tg");
        Emp emp6 = new Emp(6,"wq");
        Emp emp7 = new Emp(7,"hg");
        Emp emp8 = new Emp(8,"fd");
        htd.add(emp1);
        htd.add(emp2);
        htd.add(emp3);
        htd.add(emp4);
        htd.add(emp5);
        htd.add(emp6);
        htd.add(emp7);
        htd.add(emp8);
        htd.list();
    }
}
