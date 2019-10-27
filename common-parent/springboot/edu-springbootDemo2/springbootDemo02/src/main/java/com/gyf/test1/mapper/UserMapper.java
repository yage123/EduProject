package com.gyf.test1.mapper;

import com.gyf.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into user(username,password) values (#{username},#{password})")
    public void save(@Param("username") String username, @Param("password") String password);
    @Select("select * from user where username='${username}'")
    public User fingByUsername(@Param("username") String username);
}
