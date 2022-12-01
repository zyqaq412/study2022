package 其他.动态代理;

/**
 * @title: Main
 * @Author zxwyhzy
 * @Date: 2022/12/1 19:16
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        UserTest userTest = new UserImpl();
        UserTest proxy = proxyUtil.getProxy(userTest);
        proxy.delete();
        proxy.update();

        BookTest bookTest = new BookImpl();
        BookTest proxy1 = proxyUtil.getProxy(bookTest);
        proxy1.buy();


    }
}
