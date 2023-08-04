package com.example.bankdemo.Controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.bankdemo.Controller.Dto.UserDto;
import com.example.bankdemo.Entity.User;
import com.example.bankdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 职员登录
     *
     * @param userDto
     * @return
     */
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }

    /**
     * 添加职员
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public boolean addUser(@RequestBody User user) {
        return userService.save(user);
    }

    /**
     * 根据ID删除职员
     * 传递的是一个Id集合
     *
     * @param userId
     * @return
     */
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody List<Integer> userId) {
        if (userId == null) return false;
        return userService.removeBatchByIds(userId);
    }

    /**
     * 根据ID修改职员信息
     * @param user
     * @return
     */
    @PutMapping("/updateUserById")
    public boolean updateUserById(@RequestBody User user) {
        return userService.updateById(user);
    }

/*    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody User user) {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();

        //根据职员ID 或/和 职员的用户名进行条件修改
        //需要其他条件，后续再添加
        if (user.getUserId() != null) {
            updateWrapper.set("user_id", user.getUserId());
        }
        if (user.getUsername() != null) {
            updateWrapper.set("username", user.getUsername());
        }

        System.out.println("user = " + user);
        return userService.update(user, updateWrapper);

        *//*if (!updateWrapper.isEmptyOfWhere() || !updateWrapper.isEmptyOfNormal()) {
            return userService.update(user, updateWrapper);
        } else {
            return false;
//            throw new IllegalArgumentException("No updateable fields provided.");
        }*//*
    }*/


    /**
     * 根据条件动态查询职员（有条件根据条件查询，没有则查询所有）
     * @param user
     * @return
     */
    @GetMapping("/selectUser")
    public List<User> selectUser(@RequestBody User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (user.getUserId() != null) {
            queryWrapper.eq("user_id", user.getUserId());
        }
        if (user.getUsername() != null) {
            queryWrapper.eq("username", user.getUsername());
        }

        return userService.list(queryWrapper);
    }
}
