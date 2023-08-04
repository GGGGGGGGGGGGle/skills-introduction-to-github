package com.example.bankdemo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bankdemo.Entity.Transaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionMapper  extends BaseMapper<Transaction> {
}
