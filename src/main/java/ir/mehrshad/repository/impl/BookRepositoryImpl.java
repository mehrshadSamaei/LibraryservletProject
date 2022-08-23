package ir.mehrshad.repository.impl;

import ir.mehrshad.base.repository.impl.BaseRepositoryImpl;
import ir.mehrshad.entity.Book;
import ir.mehrshad.repository.BookRepository;

import javax.persistence.EntityManager;

public class BookRepositoryImpl extends BaseRepositoryImpl<Long , Book> implements BookRepository {
    public BookRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    protected Class<Book> getEntityClass() {
        return Book.class;
    }
}
