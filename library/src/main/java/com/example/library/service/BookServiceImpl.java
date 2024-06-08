package com.example.library.service;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);

    }

    @Override
    public Book find(UUID id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Set<UUID> bookIds) {
        bookRepository.deleteAllByIdInBatch(bookIds);
    }
}
