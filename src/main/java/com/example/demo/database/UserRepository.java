package com.example.demo.database;

import com.example.demo.database.model.DbUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<DbUser, String> {

    DbUser findByEmail(String email);

}
