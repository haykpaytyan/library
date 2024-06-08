// src/main/java/com/example/library/model/Book.java
package com.example.library.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Entity
public class Book {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String author;
    @Getter
    @Setter
    private String iconUrl;


    public Book(UUID id, String title, String author, String iconUrl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.iconUrl = iconUrl;
    }

    public Book() {

    }
}
