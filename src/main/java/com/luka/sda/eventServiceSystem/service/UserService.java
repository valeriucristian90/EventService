package com.luka.sda.eventServiceSystem.service;

import com.luka.sda.eventServiceSystem.dto.CreateUserRequest;
import com.luka.sda.eventServiceSystem.dto.UserTemplate;
import com.luka.sda.eventServiceSystem.mapper.UserMapper;
import com.luka.sda.eventServiceSystem.model.User;
import com.luka.sda.eventServiceSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public UserTemplate save(CreateUserRequest request) {
        User user = userMapper.toEntity(request);
        User newUser = userRepository.save(user);
        return userMapper.toDto(newUser);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
