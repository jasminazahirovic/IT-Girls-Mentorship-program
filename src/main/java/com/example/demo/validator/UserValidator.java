package com.example.demo.validator;

import com.example.demo.domain.UserCreation;
import org.springframework.stereotype.Component;


@Component
public class UserValidator {

    public boolean isValidUser(UserCreation creation) {

        return false;
    }
}
