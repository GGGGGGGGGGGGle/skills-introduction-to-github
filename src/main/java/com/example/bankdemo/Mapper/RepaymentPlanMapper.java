package com.example.bankdemo.Mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bankdemo.Entity.RepaymentPlans;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RepaymentPlanMapper  extends BaseMapper<RepaymentPlans> {
}
