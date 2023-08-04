package com.example.bankdemo.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Entity.CreditCards;
import com.example.bankdemo.Mapper.CreditCardMapper;
import com.example.bankdemo.Service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardImpl extends ServiceImpl<CreditCardMapper, CreditCards> implements CreditCardService {
    @Autowired
    private CreditCardMapper creditCardMapper;


    @Override
    public List<CreditCards> selectCreditCardsByCustomerId(Integer customerId) {
        QueryWrapper<CreditCards> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("customer_id", customerId);
        return list(queryWrapper);
    }
}
