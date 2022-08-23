package ir.mehrshad.util;

import ir.mehrshad.repository.impl.BookRepositoryImpl;
import ir.mehrshad.repository.impl.BorrowRepositoryImpl;
import ir.mehrshad.repository.impl.UserRepositoryImpl;
import ir.mehrshad.service.impl.BookServiceImpl;
import ir.mehrshad.service.impl.BorrowServiceImpl;
import ir.mehrshad.service.impl.UserServiceImpl;

import javax.persistence.EntityManager;

public class ApplicationContext {
    private static ApplicationContext instance;
    private EntityManager entityManager;
    private BookRepositoryImpl bookRepository;
    private UserRepositoryImpl userRepository;
    private BorrowRepositoryImpl borrowRepository;

    private BookServiceImpl bookService;
    private UserServiceImpl userService;
    private BorrowServiceImpl borrowService;

    public BookRepositoryImpl getBookRepository() {
        if (bookRepository == null)
            bookRepository = new BookRepositoryImpl(getEntityManager());
        return bookRepository;
    }

    public UserRepositoryImpl getUserRepository() {
        if (userRepository == null)
            userRepository = new UserRepositoryImpl(getEntityManager());
        return userRepository;
    }

    public BorrowRepositoryImpl getBorrowRepository() {
        if (borrowRepository == null)
            borrowRepository = new BorrowRepositoryImpl(getEntityManager());
        return borrowRepository;
    }

    public BookServiceImpl getBookService() {
        if (bookService == null)
            bookService = new BookServiceImpl(getBookRepository());
        return bookService;
    }

    public UserServiceImpl getUserService() {
        if (userService == null)
            userService = new UserServiceImpl(getUserRepository());
        return userService;
    }

    public BorrowServiceImpl getBorrowService() {
        if (borrowService == null)
            borrowService = new BorrowServiceImpl(getBorrowRepository());
        return borrowService;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public static ApplicationContext getInstance() {
        return instance;
    }
}
