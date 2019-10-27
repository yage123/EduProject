package com.gyf.test2.mapper;

import com.gyf.model.Customer;
import com.gyf.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {

   @Insert("insert into customer (name,tel) values (#{name},#{tel})")
    public void save(@Param("name") String username, @Param("tel") String tel);
    @Select("select * from customer where name='${username}'")
    public Customer fingByUsername(@Param("username") String username);
}
