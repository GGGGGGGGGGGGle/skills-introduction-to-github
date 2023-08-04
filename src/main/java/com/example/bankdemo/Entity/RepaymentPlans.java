package com.example.bankdemo.Entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "repayment_plans")
public class
RepaymentPlans {
    @TableId(type = IdType.AUTO)
    private Integer planId;
    private Integer loanId;
    private Integer planType;
}
