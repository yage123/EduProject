package com.yuxiu.edu.service.base;

import com.yuxiu.edu.mapper.UserMapper;
import com.yuxiu.edu.service.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
