package com.example.bankdemo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bankdemo.Entity.Loan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanMapper  extends BaseMapper<Loan> {
}
