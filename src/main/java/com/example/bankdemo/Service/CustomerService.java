package com.example.bankdemo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bankdemo.Controller.Dto.CustomerDto;
import com.example.bankdemo.Entity.Customer;

public interface CustomerService extends IService<Customer> {

    boolean login(CustomerDto customerDto);
}
