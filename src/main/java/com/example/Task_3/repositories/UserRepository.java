package com.example.Task_3.repositories;

import com.example.Task_3.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ '_id': ?0 }")
    @Update("{ $set: { 'username' : ?1 } }")
    void updateUserUsername(String id, String username);
}
