package com.hzy.service;

import com.hzy.mapper.BrandDemoMapper;
import com.hzy.pojo.Brand;
import com.hzy.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @title: BrandService
 * @Author zxwyhzy
 * @Date: 2022/11/12 18:41
 * @Version 1.0
 */
public class BrandService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();

    /**
     * 查询所以
     * @return
     */
    public List<Brand> selectAll(){

        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取 BrandDemoMapper
        BrandDemoMapper mapper = sqlSession.getMapper(BrandDemoMapper.class);
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;
    }
    public void addBrand(Brand brand){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandDemoMapper mapper = sqlSession.getMapper(BrandDemoMapper.class);
        mapper.insertBrand(brand);
        sqlSession.commit();
        sqlSession.close();
    }
    public void delBrand(int id){
        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取 BrandDemoMapper
        BrandDemoMapper mapper = sqlSession.getMapper(BrandDemoMapper.class);
        mapper.delById(id);
        sqlSession.commit();
        sqlSession.close();

    }
    public void modify(Brand brand){
        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取 BrandDemoMapper
        BrandDemoMapper mapper = sqlSession.getMapper(BrandDemoMapper.class);
        mapper.updateById(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public Brand SelectById(int id) {
        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取 BrandDemoMapper
        BrandDemoMapper mapper = sqlSession.getMapper(BrandDemoMapper.class);
        Brand brand = mapper.selectById(id);
        return brand;
    }
}
