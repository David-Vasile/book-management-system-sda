package com.sda.David.bookmanagement.controller;

import com.sda.David.bookmanagement.service.BookService;
import com.sda.David.bookmanagement.service.exceptions.EntityNotFoundException;

import java.util.Scanner;

public class BookController {

    private final Scanner scanner = new Scanner(System.in);
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void createBook() {
        System.out.println("please insert a title");
        String title = scanner.nextLine();
        System.out.println("Insert descrip" );
        String description = scanner.nextLine();
        System.out.println("Please insert an author id");
        int authorId = Integer.parseInt(scanner.nextLine());

        try {
            bookService.createBook(title, description, authorId);
            System.out.println("Book was created!");
        }catch (NumberFormatException e){
            System.out.println("Please insert a numberic value for author id!");
        }
        catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Internal system error!");
        }
    }
}
