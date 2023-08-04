package com.example.bankdemo.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Entity.Account;
import com.example.bankdemo.Mapper.AccountMapper;
import com.example.bankdemo.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>  implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> selectAccountsByCustomerId(Integer customerId) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("customer_id", customerId);
        return list(queryWrapper);
    }
}
