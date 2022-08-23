package ir.mehrshad.service.impl;

import ir.mehrshad.base.service.impl.BaseServiceImpl;
import ir.mehrshad.entity.Borrow;
import ir.mehrshad.repository.impl.BorrowRepositoryImpl;
import ir.mehrshad.service.BorrowService;

public class BorrowServiceImpl extends BaseServiceImpl<Long , Borrow, BorrowRepositoryImpl> implements BorrowService {
    public BorrowServiceImpl(BorrowRepositoryImpl repository) {
        super(repository);
    }
}
