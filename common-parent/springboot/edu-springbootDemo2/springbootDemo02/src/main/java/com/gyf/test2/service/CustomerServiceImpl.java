package com.gyf.test2.service;

import com.gyf.model.Customer;
import com.gyf.test1.mapper.UserMapper;
import com.gyf.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl {

    @Autowired
    private CustomerMapper customerMapper;
    public void register(String name, String tel) {
        customerMapper.save(name,tel);
    }
    public Customer find(String name) {
        return customerMapper.fingByUsername(name);
    }

}
