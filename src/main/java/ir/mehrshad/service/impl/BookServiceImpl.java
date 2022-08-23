package ir.mehrshad.service.impl;

import ir.mehrshad.base.service.impl.BaseServiceImpl;
import ir.mehrshad.entity.Book;
import ir.mehrshad.repository.impl.BookRepositoryImpl;
import ir.mehrshad.service.BookService;

public class BookServiceImpl extends BaseServiceImpl<Long , Book, BookRepositoryImpl> implements BookService {
    public BookServiceImpl(BookRepositoryImpl repository) {
        super(repository);
    }
}
