import com.hzy.mapper.BrandMapper;
import com.hzy.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @title: MyBatisTest
 * @Author zxwyhzy
 * @Date: 2022/10/28 18:58
 * @Version 1.0
 */
public class MyBatisTest {
    @Test
    public void testSelectAll() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        ///4.执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testSelectById() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        ///4.执行方法
        Brand brand = brandMapper.selectByIdBrand(1);
        System.out.println(brand);

        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void selectByStatusAndByBrandNameAndByCompanyName() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        ///4.执行方法

        //注解方式
        /*List<Brand> brands = brandMapper.selectByStatusAndByBrandNameAndByCompanyName
                (1,"%华为%","%华为%");*/
        //对象方式
        Brand brand = new Brand();
        //brand.setStatus();
        /*brand.setBrandName("%华为%");
        brand.setCompanyName("%华为%");*/
        brand.setBrandName("小米");
        //brand.setCompanyName("");
        List<Brand> brands = brandMapper.selectByStatusAndByBrandNameAndByCompanyName(brand);
        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void selectByOne() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        //brand.setStatus();
        /*brand.setBrandName("%华为%");
        brand.setCompanyName("%华为%");*/
        brand.setBrandName("小米");
        //brand.setCompanyName("");
        List<Brand> brands = brandMapper.selectByOne(brand);
        System.out.println(brands);

        //5.释放资源
        sqlSession.close();

    }
    @Test
    public void addAll() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        String companyName = "魅族科技有限公司";
        String brandName = "魅族";
        String description = "青年良品";
        int ordered = 100;
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);

        brandMapper.addAll(brand);
        System.out.println(brand.getId());
        //提交事务
        sqlSession.commit();


        //5.释放资源
        sqlSession.close();

    }
    @Test
    public void updateAll() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        int id = 6;
        //String companyName = "垂直科技有限公司";
        String brandName = "锤子";
        //String description = "有容乃大";
        //int ordered = 100;
        brand.setId(id);
        //brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        //brand.setDescription(description);
        //brand.setOrdered(ordered);

        int i = brandMapper.updateAll(brand);
        System.out.println(i);
        //提交事务
        sqlSession.commit();


        //5.释放资源
        sqlSession.close();

    }
    @Test
    public void delByIds() throws Exception{
        //1.获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        int[] ids = {9,10};
        brandMapper.delByIds(ids);

        sqlSession.commit();


        sqlSession.close();

    }
}
