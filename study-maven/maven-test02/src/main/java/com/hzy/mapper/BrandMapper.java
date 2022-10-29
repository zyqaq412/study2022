package com.hzy.mapper;

import com.hzy.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    @ResultMap("brandResultMap")
    //简单sql 使用注解开发
    @Select("select * from tb_brand")
    List<Brand> selectAll();
    @ResultMap("brandResultMap")// 数据库列名和对象属性名不一样需要 映射注解
    @Select("select * from tb_brand where id = #{id}")
    Brand selectByIdBrand(int id);


    //注解方式
    /*List<Brand> selectByStatusAndByBrandNameAndByCompanyName(
            @Param("status") int status,
            @Param("brandName")String brandName,
            @Param("companyName")String companyName);*/
    //对象方式
    List<Brand> selectByStatusAndByBrandNameAndByCompanyName(Brand brand);
    List<Brand> selectByOne(Brand brand);

    void  addAll(Brand brand);
    int updateAll(Brand brand);
    void delByIds(@Param("ids") int[] ids);
}
