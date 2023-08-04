package com.example.bankdemo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@TableName(value = "users")
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String username;

    @JsonIgnore
    private String password;
    private String role;

}
