package 其他.动态代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @title: proxyUtil
 * @Author zxwyhzy
 * @Date: 2022/12/1 19:06
 * @Version 1.0
 */
public class proxyUtil {
    public static <T>T getProxy(T obj){
        return (T)Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long begin = System.currentTimeMillis();

                Object invoke = method.invoke(obj, args);
                long end = System.currentTimeMillis();
                System.out.println("消耗的时间是："+(end-begin)+"毫秒");
                return invoke;
            }
        });
    }
}
