package com.example.bankdemo.Service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Entity.Loan;
import com.example.bankdemo.Mapper.LoanMapper;
import com.example.bankdemo.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl extends ServiceImpl<LoanMapper, Loan> implements LoanService {
    @Autowired
    private LoanMapper loanMapper;
}
