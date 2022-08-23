package com.example.springboot.DesignPatterns.ProxyPattern;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public Book create(String author) {
        return new Book(author);
    }
}
