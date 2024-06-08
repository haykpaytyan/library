// src/main/java/com/example/library/service/BookService.java
package com.example.library.service;

import com.example.library.entity.Book;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface BookService {

    List<Book> findAll();

    Book save(Book book);

    Book find(UUID id);

    void delete(Set<UUID> bookIds);

}
