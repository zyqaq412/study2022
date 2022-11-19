import com.hzy.dao.BookDao;
import com.hzy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: app
 * @Author zxwyhzy
 * @Date: 2022/11/18 16:25
 * @Version 1.0
 */
public class app {
    public static void main(String[] args) {
        //3.获取IoC容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        /*BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();*/
        //ctx.close();



        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        ctx.registerShutdownHook();
    }
}
