package com.example.demo.service;

import com.example.demo.database.UserDatabaseService;
import com.example.demo.domain.UserCreation;
import com.example.demo.exception.UserNotValidException;
import com.example.demo.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDatabaseService dbService;

    @Autowired
    private UserValidator validator;

    public void saveUser(UserCreation creation) {
        if(validator.isValidUser(creation)) {
            dbService.saveUser(creation);
        }
        throw new UserNotValidException("User creation object not valid");
    }

}
