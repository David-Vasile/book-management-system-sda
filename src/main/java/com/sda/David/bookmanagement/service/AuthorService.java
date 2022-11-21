package com.sda.David.bookmanagement.service;

import com.sda.David.bookmanagement.model.Author;
import com.sda.David.bookmanagement.service.exceptions.EntityNotFoundException;
import com.sda.David.bookmanagement.service.exceptions.InvalidParameterException;


import java.util.List;

public interface AuthorService {

    void createAuthor(String firstName,String lastName) throws InvalidParameterException;

    void updateAuthor(int authorId, String firstName, String lastName) throws InvalidParameterException, EntityNotFoundException;

    public void deleteAuthor(int authorId) throws InvalidParameterException,EntityNotFoundException;
    List<Author> getAllAuthors();


}
