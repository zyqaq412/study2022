import org.example.dao.BookDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: appTest
 * @Author zxwyhzy
 * @Date: 2022/12/13 23:24
 * @Version 1.0
 */
public class appTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springConfig.xml");
        BookDao bookDaoBean = (BookDao)applicationContext.getBean("bookDaoBean");
        bookDaoBean.buy();
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springConfig.xml");
        BookDao bookDaoBean1 = applicationContext.getBean("bookDaoBean", BookDao.class);
        BookDao bookDaoBean2 = applicationContext.getBean(BookDao.class);
        bookDaoBean1.buy();
        bookDaoBean2.buy();
    }
}
