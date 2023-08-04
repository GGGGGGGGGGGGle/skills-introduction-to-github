package com.example.bankdemo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bankdemo.Entity.Customer;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
}
