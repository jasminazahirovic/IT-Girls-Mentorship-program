package com.example.demo.database;

import com.example.demo.database.UserRepository;
import com.example.demo.database.model.DbUser;
import com.example.demo.domain.User;
import com.example.demo.domain.UserCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserDatabaseService {

    @Autowired
    private UserRepository repo;

    public void saveUser(UserCreation userCreation) {
        DbUser dbUser = createDbUserFromUserCreation(userCreation);
        repo.save(dbUser);
    }

    public User getUserByEmail(String email) {
        DbUser dbUser = repo.findByEmail(email);
        return createUserFromDb(dbUser);
    }

    private DbUser createDbUserFromUserCreation(UserCreation userCreation) {
        DbUser dbUser = new DbUser();
        dbUser.setFirstName(userCreation.getFirstName());
        dbUser.setLastName(userCreation.getLastName());
        dbUser.setEmail(userCreation.getEmail());
        dbUser.setPassword(userCreation.getPassword());
        dbUser.setBirth_date(userCreation.getBirthDay());
        dbUser.setMarital_status(userCreation.getMaritalStatus());
        return dbUser;
    }

    private User createUserFromDb(DbUser dbUser){
        User user = new User();
        user.setId(dbUser.getId());
        user.setFirstName(dbUser.getFirstName());
        user.setLastName(dbUser.getLastName());
        user.setEmail(dbUser.getEmail());
        user.setPassword(dbUser.getPassword());
        user.setBirth_date(dbUser.getBirth_date());
        user.setMarital_status(dbUser.getMarital_status());
        return user;
    }
}
