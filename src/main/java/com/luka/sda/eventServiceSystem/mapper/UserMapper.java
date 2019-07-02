package com.luka.sda.eventServiceSystem.mapper;

import com.luka.sda.eventServiceSystem.dto.UserTemplate;
import com.luka.sda.eventServiceSystem.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User toEntity(UserTemplate template) {
        User user = new User();
        user.setFirstName(template.getFirstName());
        user.setEmail(template.getEmail());
        user.setPassword(template.getPassword());
        return user;
    }

    public List<UserTemplate> toDto(List<User> users) {
        return users.stream()
                .map(user -> this.toDto(user))
                .collect(Collectors.toList());
    }

    public List<UserTemplate> toDtoOldWay(List<User> givenList) {
        // create new list for modified objects
        List<UserTemplate> resultList = new ArrayList<>();

        // for each item in old list transform
        for (User user : givenList) {
            UserTemplate userTemplate = this.toDto(user);

            // add transformed item to new list
            resultList.add(userTemplate);
        }
        return resultList;
    }

    public UserTemplate toDto(User user) {
        UserTemplate userTemplate = new UserTemplate();
        userTemplate.setId(user.getId());
        userTemplate.setFirstName(user.getFirstName());
        userTemplate.setEmail(user.getEmail());
        return userTemplate;
    }


}
