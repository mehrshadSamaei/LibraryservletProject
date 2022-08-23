package ir.mehrshad.repository.impl;

import ir.mehrshad.base.repository.impl.BaseRepositoryImpl;
import ir.mehrshad.entity.Borrow;
import ir.mehrshad.repository.BorrowRepository;

import javax.persistence.EntityManager;

public class BorrowRepositoryImpl extends BaseRepositoryImpl<Long , Borrow> implements BorrowRepository {
    public BorrowRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    protected Class<Borrow> getEntityClass() {
        return Borrow.class;
    }
}
