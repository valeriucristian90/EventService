package com.luka.sda.eventServiceSystem.controller;

import com.luka.sda.eventServiceSystem.dto.UserTemplate;
import com.luka.sda.eventServiceSystem.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex (){
        return "index";
    }

    @RequestMapping("/register")
    public String getRegister (Model model){
        model.addAttribute("user", new UserTemplate());
        return "register";
    }

    @RequestMapping(value="/register", method= RequestMethod.POST)
    public String saveUser(UserTemplate ut){

        System.out.println(ut);
        return "index";

    }


}
