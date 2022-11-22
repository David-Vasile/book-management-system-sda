package com.sda.David.bookmanagement;

import com.sda.David.bookmanagement.Repository.AuthorRepositoryImpl;
import com.sda.David.bookmanagement.Repository.BookRepositoryImpl;
import com.sda.David.bookmanagement.Repository.BookReviewRepository;
import com.sda.David.bookmanagement.Repository.BookReviewRepositoryImpl;
import com.sda.David.bookmanagement.controller.AuthorController;
import com.sda.David.bookmanagement.controller.BookController;
import com.sda.David.bookmanagement.controller.BookReviewController;
import com.sda.David.bookmanagement.meniu.UserOption;
import com.sda.David.bookmanagement.model.Review;
import com.sda.David.bookmanagement.service.AuthorServiceImpl;
import com.sda.David.bookmanagement.service.BookReviewServiceImpl;
import com.sda.David.bookmanagement.service.BookServiceImpl;
import com.sda.David.bookmanagement.utils.SessionManager;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SessionManager.getSessionFactory();
        AuthorController authorController = new AuthorController(new AuthorServiceImpl(new AuthorRepositoryImpl()));
        BookController bookController = new BookController(new BookServiceImpl(new BookRepositoryImpl(), new AuthorRepositoryImpl()));
        BookReviewController reviewController = new BookReviewController(new BookReviewServiceImpl(new BookReviewRepositoryImpl(), new BookRepositoryImpl()));

        Scanner scanner = new Scanner(System.in);

        UserOption userOption;
        do {
            UserOption.printAllOptions();
            System.out.println("Please select an option!");
            try {
                int numericOption= Integer.parseInt(scanner.nextLine());
                userOption = UserOption.findUserOption(numericOption);
            }catch (NumberFormatException e){
                userOption= UserOption.UNKNOWN;
            }


            switch (userOption) {
                case CREATE_AUTHOR :
                    authorController.createAuthor();
                    break;

                case SHOW_ALL_AUTHORS:
                    authorController.showAllAuthors();
                    break;
                case UPDATE_AUTHOR:
                    authorController.updateAuthor();
                    break;
                case DELETE_AUTHOR:
                    authorController.deleteAuthor();
                  break;

                case CREATE_BOOK:
                    bookController.createBook();
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    break;
                case UNKNOWN:
                    System.out.println("Option unknown");
                    break;
                default:
                    System.out.println("User option "+ userOption + " is not implemented");
                    break;
            }

        } while (userOption != UserOption.EXIT);
        SessionManager.shutDown();
    }
}
