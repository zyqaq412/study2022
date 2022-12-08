package com.hzy.dao;

import com.hzy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @title: UserDao
 * @Author zxwyhzy
 * @Date: 2022/12/8 20:57
 * @Version 1.0
 */
@Mapper
public interface UserDao {
    @Select("select * from tb_user where username = #{username} and password=#{password}")
    User select(User user);
}
