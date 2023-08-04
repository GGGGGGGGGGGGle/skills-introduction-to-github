package com.example.bankdemo.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Entity.RepaymentPlans;
import com.example.bankdemo.Mapper.RepaymentPlanMapper;
import com.example.bankdemo.Service.RepaymentPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepaymentPlanImpl extends ServiceImpl<RepaymentPlanMapper, RepaymentPlans> implements RepaymentPlanService {
    @Autowired
    private RepaymentPlanMapper repaymentPlanMapper;
}
