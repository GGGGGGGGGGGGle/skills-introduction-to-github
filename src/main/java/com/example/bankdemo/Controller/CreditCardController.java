package com.example.bankdemo.Controller;


import com.example.bankdemo.Entity.CreditCards;
import com.example.bankdemo.Service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {
    @Autowired
    private CreditCardService creditCardService;

    /**
     * 根据顾客ID查询信用卡信息
     * @param customerId
     * @return
     */
    @GetMapping("/selectCreditCards")
    public List<CreditCards> selectCreditCardsByCustomerId(Integer customerId) {
        return creditCardService.selectCreditCardsByCustomerId(customerId);
    }
}
