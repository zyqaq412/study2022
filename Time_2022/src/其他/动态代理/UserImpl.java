package 其他.动态代理;

/**
 * @title: UserImpl
 * @Author zxwyhzy
 * @Date: 2022/12/1 19:05
 * @Version 1.0
 */
public class UserImpl implements UserTest{

    @Override
    public void delete() {
        try {
            Thread.sleep(1200);
            System.out.println("删除成功");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update() {
        try {
            Thread.sleep(1000);
            System.out.println("更新成功");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
