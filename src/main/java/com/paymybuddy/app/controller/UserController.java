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

    @GetMapping("/login")
    public String logIn(){
        return "login";
    }

    @GetMapping("/transfer")
    public String viewTransferPage(){
        return "transfer";
    }

    @GetMapping("/home")
    public String viewHomePage(){
        return "home";
    }

    @GetMapping("/profile")
    public String viewProfilePage(){
        return "profile";
    }

    @GetMapping("/profileEdition")
    public String viewProfileEditionPage(){
        return "profileEdition";
    }

    @GetMapping("/contact")
    public String viewContactPage(){
        return "contact";
    }

    @GetMapping("/contactNotFound")
    public String viewContactNotFoundPage(){
        return "contactNotFound";
    }

    @GetMapping("/registration")
    public String viewRegistrationPage(){
        return "registration";
    }

    @GetMapping("/logoff")
    public String viewLoggOffPage(){
        return "logoff";
    }

}
