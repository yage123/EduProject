package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.mdoel.User;

public interface BaseMapper<T> {
    /*通过Id查找用户*/
    public T findById(Integer id);
    public T findByUUId(String id);
    /*通过Id删除用户*/
    public void deleteById(Integer id);
    public void deleteByUUId(String id);
    public void insert(T t);
    public void update(T t);
}
