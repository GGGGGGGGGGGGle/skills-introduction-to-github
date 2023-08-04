package com.example.bankdemo.Controller;

import com.example.bankdemo.Service.RepaymentPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repayment")
public class RepaymentController {
    @Autowired
    private RepaymentPlanService repaymentPlanService;
}
