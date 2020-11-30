package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.domain.UserCreation;
import com.example.demo.database.UserDatabaseService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public void createUser(@RequestBody UserCreation userCreation) {
        log.info("User creation endpoint. Received user: {}", userCreation);
        service.saveUser(userCreation);
    }

    @GetMapping("/users")
    public User getUserByEmail(@RequestParam(name = "email") String email) {
        log.info("Get user by email endpoint. Received email: {}", email);
//        return service.getUserByEmail(email);
        return null;
    }

}
