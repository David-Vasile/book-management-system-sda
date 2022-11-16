package com.sda.David.bookmanagement.utils;


import com.sda.David.bookmanagement.model.Author;
import com.sda.David.bookmanagement.model.Book;
import com.sda.David.bookmanagement.model.Review;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class SessionManager extends AbstractSessionManager {

    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("book_manager_system");
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        // Hibernate model will be added here
configuration.addAnnotatedClass(Author.class);
configuration.addAnnotatedClass(Book.class);
configuration.addAnnotatedClass(Review.class);
    }
}