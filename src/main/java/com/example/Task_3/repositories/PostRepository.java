package com.example.Task_3.repositories;

import com.example.Task_3.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{'author' : ?0}")
    List<Post> getPostsByAuthorId(String id);
}
