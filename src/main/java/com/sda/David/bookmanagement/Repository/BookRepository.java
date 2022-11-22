package com.sda.David.bookmanagement.Repository;

import com.sda.David.bookmanagement.model.Book;

import java.util.Optional;

public interface BookRepository extends BaseRepository<Book> {
    Optional<Book> findByTitle(String title);
}

