package com.example.bankdemo.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Controller.Dto.CustomerDto;
import com.example.bankdemo.Entity.Customer;
import com.example.bankdemo.Mapper.CustomerMapper;
import com.example.bankdemo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl  extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Autowired
    private  CustomerMapper customerMapper;

    @Override
    public  boolean login(CustomerDto customerDto) {
        QueryWrapper<Customer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email",customerDto.getEmail());
        queryWrapper.eq("password",customerDto.getPassword());
        System.out.println(customerDto.getEmail());
        System.out.println(customerDto.getPassword());
        try{
            Customer one = getOne(queryWrapper);
            System.out.println(one.getCustomerId());
            System.out.println(one.getPassword());
            return one != null;
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
    }

}
