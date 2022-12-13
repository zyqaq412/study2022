import com.hzy.pojo.Data;
import com.hzy.pojo.Data2;
import com.hzy.pojo.Data3;
import com.hzy.service.BookService;
import com.hzy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: ylTest
 * @Author zxwyhzy
 * @Date: 2022/12/14 0:09
 * @Version 1.0
 */
public class ylTest {

    @Test
    public void setTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springConfig.xml");
        BookService bookServiceBean =
                applicationContext.getBean("bookServiceBean", BookService.class);
        bookServiceBean.buy();
    }
    @Test
    public void newTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springConfig.xml");
        UserService userServiceBean =
                applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.login();
    }
    @Test
    public void neiTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springConfig2.xml");
        BookService bookServiceBean =
                applicationContext.getBean("bookServiceBean", BookService.class);
        bookServiceBean.buy();
    }
    @Test
    public void jibengleixTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springjibengleixing.xml");
        Data data =
                applicationContext.getBean("dataBean", Data.class);
        System.out.println(data);
        if (data.isFlag()){
            System.out.println("对");
        }else {
            System.out.println("不对");
        }
    }
    @Test
    public void jibengleixTest2(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springjibengleixing2.xml");
        Data data1 =
                applicationContext.getBean("dataBean1", Data.class);
        System.out.println(data1);
        Data data2 =
                applicationContext.getBean("dataBean2", Data.class);
        System.out.println(data2);
        if (data2.isFlag()){
            System.out.println("对");
        }else {
            System.out.println("不对");
        }
    }
    @Test
    public void BaoZhunagTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("baoZhuangLeiXing.xml");
        Data2 data2Bean1 = applicationContext.getBean("data2Bean1", Data2.class);
        System.out.println(data2Bean1);
        Data2 data2Bean2 = applicationContext.getBean("data2Bean2", Data2.class);
        System.out.println(data2Bean2);
    }
    @Test
    public void meijuClassTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("meijuClass.xml");
        Data3 data3Bean = applicationContext.getBean("data3Bean", Data3.class);
        System.out.println(data3Bean);
    }
}
