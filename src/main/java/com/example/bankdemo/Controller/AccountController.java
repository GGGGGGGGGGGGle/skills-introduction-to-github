package com.example.bankdemo.Controller;

import com.example.bankdemo.Entity.Account;
import com.example.bankdemo.Service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 根据顾客ID查询账户信息
     * @param customerId
     * @return
     */
    @GetMapping("/selectAccounts")
    public List<Account> selectAccountsByCustomerId(Integer customerId){
        return accountService.selectAccountsByCustomerId(customerId);
    }

}
