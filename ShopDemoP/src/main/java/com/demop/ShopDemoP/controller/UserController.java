package com.demop.ShopDemoP.controller;

import com.demop.ShopDemoP.domain.User.User;
import com.demop.ShopDemoP.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        if (userService.findByUsername(user.getName()) != null) {
            return "Username already exists!";
        }
        if (userService.findByEmail(user.getEmail()) != null) {
            return "Email already exists!";
        }
        userService.saveUser(user);
        return "User registered successfully!";
    }

}
