package com.sda.David.bookmanagement.service;


import com.sda.David.bookmanagement.service.exceptions.EntityNotFoundException;
import com.sda.David.bookmanagement.service.exceptions.InvalidParameterException;

public interface BookService {
    void createBook(String title, String description, int authorId) throws EntityNotFoundException, InvalidParameterException;
}