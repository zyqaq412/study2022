package 其他.动态代理;

/**
 * @title: BookImpl
 * @Author zxwyhzy
 * @Date: 2022/12/1 19:18
 * @Version 1.0
 */
public class BookImpl implements BookTest{
    @Override
    public void buy() {
        System.out.println("买到书了");
    }
}
