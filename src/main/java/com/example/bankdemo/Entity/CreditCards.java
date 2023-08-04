package com.example.bankdemo.Entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Data
@Table(name = "credit_cards")
public class CreditCards {

    @TableId(type = IdType.AUTO)
    private Integer cardId;
    private Integer customerId;
    private String cardNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate;
    private BigDecimal creditLimit;
}
