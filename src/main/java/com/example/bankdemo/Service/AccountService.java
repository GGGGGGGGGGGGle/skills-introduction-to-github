package com.example.bankdemo.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bankdemo.Entity.Account;

import java.util.List;

public interface AccountService  extends IService<Account> {
    List<Account> selectAccountsByCustomerId(Integer customerId);
}
