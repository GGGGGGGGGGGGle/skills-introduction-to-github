package com.example.bankdemo.Entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Table(name = "Transactions")

@Data
public class Transaction {
    @TableId(type = IdType.AUTO)
    private Integer transactionId;
    private Integer accountId;
    private Integer targetAccountId;
    private String transactionType;
    private BigDecimal amount;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date transactionDate;



}
