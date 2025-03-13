package com.example.Task_3.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document("posts")
public class Post {
    @Id
    private String id;

    private String title;
    private String content;

    @DBRef
    private User author;


    private List<Comment> comments;

    public Post() {
    }

    public Post(String title, String content, User author, List<Comment> comments) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.comments = comments;
    }

    public Post(String id, String title, String content, User author, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.comments = comments;
    }
}
