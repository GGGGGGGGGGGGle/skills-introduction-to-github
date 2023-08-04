package com.example.bankdemo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bankdemo.Entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper  extends BaseMapper<Account> {
}
