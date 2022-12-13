import com.hzy.dao.BookDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: test
 * @Author zxwyhzy
 * @Date: 2022/12/13 23:50
 * @Version 1.0
 */
public class test {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        BookDao bookDaoBean = applicationContext.getBean("bookDaoBean", BookDao.class);
        bookDaoBean.buy();
    }
}
