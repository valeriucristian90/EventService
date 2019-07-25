package com.luka.sda.eventServiceSystem.controller;

import com.luka.sda.eventServiceSystem.dto.UserTemplate;
import com.luka.sda.eventServiceSystem.model.User;
import com.luka.sda.eventServiceSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {


    private UserService userService;

    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/register")
    public String getRegister(Model model) {
        model.addAttribute("user", new UserTemplate());
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String saveUser(UserTemplate ut) {
        userService.save(ut);
        return "index";
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }

//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String loginUser(String email){
//        userService.loadUserByUsername(email);
//        return "index";
//    }


}
