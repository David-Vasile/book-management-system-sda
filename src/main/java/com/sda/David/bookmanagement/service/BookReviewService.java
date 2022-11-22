package com.sda.David.bookmanagement.service;

import com.sda.David.bookmanagement.service.exceptions.EntityNotFoundException;
import com.sda.David.bookmanagement.service.exceptions.InvalidParameterException;

public interface BookReviewService {
    void createBookReview(String bookTitle, int score, String comment) throws InvalidParameterException, EntityNotFoundException;
}
