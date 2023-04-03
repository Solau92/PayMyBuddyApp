package com.paymybuddy.app.controller;

import com.paymybuddy.app.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

/*    @GetMapping("/login")
    public String logIn(){
        return "signin";
    }*/

    @GetMapping("/register")
    public String viewHomePage(){
        return "index";
    }
}
