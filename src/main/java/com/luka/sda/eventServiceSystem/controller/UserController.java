package com.luka.sda.eventServiceSystem.controller;

import com.luka.sda.eventServiceSystem.dto.CreateUserRequest;
import com.luka.sda.eventServiceSystem.dto.UserTemplate;
import com.luka.sda.eventServiceSystem.mapper.UserMapper;
import com.luka.sda.eventServiceSystem.model.User;
import com.luka.sda.eventServiceSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping
    public void addUser(CreateUserRequest request) {
        userService.save(request);
    }

    @GetMapping
    public List<UserTemplate> findAll() {
        List<User> users = userService.findAll();
        return userMapper.toDto(users);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        userService.deleteAll();
    }

}
