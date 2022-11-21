package com.sda.David.bookmanagement.Repository;

import com.sda.David.bookmanagement.model.Author;

public class AuthorRepositoryImpl extends BaseRepositoryImpl<Author>  implements AuthorRepository{
    public AuthorRepositoryImpl() {

        super(Author.class);
    }
}
