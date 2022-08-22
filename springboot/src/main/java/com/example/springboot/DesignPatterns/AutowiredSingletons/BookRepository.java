package com.example.springboot.DesignPatterns.AutowiredSingletons;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BookRepository {
    public long count() {
        return 1;
    }

    public Optional<Book> findById(long id) {
        return Optional.of(new Book());
    }
}
