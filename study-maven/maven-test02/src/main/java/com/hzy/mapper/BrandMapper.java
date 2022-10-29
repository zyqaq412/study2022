package com.hzy.mapper;

import com.hzy.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();
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
