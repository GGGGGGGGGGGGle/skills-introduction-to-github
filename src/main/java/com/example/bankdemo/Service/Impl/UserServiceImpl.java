package com.example.bankdemo.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bankdemo.Controller.Dto.UserDto;
import com.example.bankdemo.Entity.Customer;
import com.example.bankdemo.Entity.User;
import com.example.bankdemo.Mapper.UserMapper;
import com.example.bankdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean login(UserDto userDto) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userDto.getUserId());
        queryWrapper.eq("password", userDto.getPassword());

        try{
            User one = getOne(queryWrapper);
            return one != null;
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
    }
}
