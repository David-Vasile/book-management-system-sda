package com.sda.David.bookmanagement.Repository;

import com.sda.David.bookmanagement.model.Review;

import java.util.List;
import java.util.Optional;

public class BookReviewRepositoryImpl extends BaseRepositoryImpl<Review> implements BookReviewRepository{
    public BookReviewRepositoryImpl() {
        super(Review.class);
    }

}