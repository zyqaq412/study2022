package 数据结构.哈希表;

/**
 * @title: Emp
 * @Author zxwyhzy
 * @Date: 2022/11/6 22:23
 * @Version 1.0
 *
 * 雇员
 */
public class Emp {
    int id;
    String name;
    Emp next;//默认为空

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
