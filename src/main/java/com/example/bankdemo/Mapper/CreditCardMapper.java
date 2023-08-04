package com.example.bankdemo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bankdemo.Entity.CreditCards;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreditCardMapper extends BaseMapper<CreditCards> {

}
