package com.hzy.mapper;

import com.hzy.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandDemoMapper {
    /**
     * 查询所以
     * @return
     */
    @ResultMap("brandResultMap")// 数据库列名和对象属性名不一样需要 映射注解
    @Select("select * from tb_brand")
    List<Brand> selectAll();

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @ResultMap("brandResultMap")// 数据库列名和对象属性名不一样需要 映射注解
    @Select("select * from tb_brand where id = #{id}")
    Brand selectById(int id);

    /**
     * 添加企业
     * @param brand
     */
    @Insert("insert into tb_brand (brand_name, company_name, ordered, description, status) " +
            "VALUES (#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void insertBrand(Brand brand);

    /**
     * 根据id删除数据
     * @param id
     */
    @Delete("delete from tb_brand where id=#{id}")
    void delById(int id);


    /**
     * 修改数据
     * @param brand
     */
    @Update("update tb_brand set brand_name=#{brandName} ," +
            "company_name=#{companyName}," +
            "ordered = #{ordered}," +
            "description=#{description}," +
            "status=#{status} " +
            "where id= #{id}")
    void updateById(Brand brand);
}
