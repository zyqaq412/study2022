package com.hzy.dao;

import com.hzy.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper//自动代理
public interface BookDao {

    @Select("select * from tbl_book where id=#{id}")
    Book getById(Integer id);

}
