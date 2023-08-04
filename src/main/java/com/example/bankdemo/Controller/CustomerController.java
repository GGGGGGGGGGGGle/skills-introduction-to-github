package com.example.bankdemo.Controller;

import com.example.bankdemo.Controller.Dto.CustomerDto;
import com.example.bankdemo.Entity.Customer;
import com.example.bankdemo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 顾客登录
     * @param customerDto
     * @return
     */
    @PostMapping("/login")
    public boolean login(@RequestBody CustomerDto customerDto) {

        boolean b =  customerService.login(customerDto);

        if(b) {
            System.out.println("success");
            return b;
        } else {
            System.out.println("fail");
            return  b;
        }
    }
}
