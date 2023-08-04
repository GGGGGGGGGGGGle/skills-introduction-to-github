package com.example.bankdemo.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Entity.Transaction;
import com.example.bankdemo.Mapper.TransactionMapper;
import com.example.bankdemo.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl  extends ServiceImpl<TransactionMapper, Transaction> implements TransactionService {
    @Autowired
    private TransactionMapper transactionMapper;
}
