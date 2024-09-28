package com.jwt.controller;

import com.jwt.models.User;
import com.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        List<User> users=userService.getUser();
        System.out.println("Getiing User");
        return users;
    }

    @GetMapping("current-user")
    public String getLoginUser(Principal principal){
        return principal.getName();
    }
}
