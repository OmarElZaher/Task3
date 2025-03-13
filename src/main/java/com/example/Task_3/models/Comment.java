package com.example.Task_3.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("comments")
public class Comment {

    private String text;
    private String date;

    public Comment() {
    }

    public Comment(String text, String date) {
        this.text = text;
        this.date = date;
    }
}
