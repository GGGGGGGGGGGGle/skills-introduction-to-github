package com.example.bankdemo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bankdemo.Controller.Dto.UserDto;
import com.example.bankdemo.Entity.User;



public interface UserService extends IService<User> {
    boolean login(UserDto userDto);
}
