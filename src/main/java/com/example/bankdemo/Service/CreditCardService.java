package com.example.bankdemo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bankdemo.Entity.CreditCards;

import java.util.List;

public interface CreditCardService extends IService<CreditCards> {
    List<CreditCards> selectCreditCardsByCustomerId(Integer customerId);
}
