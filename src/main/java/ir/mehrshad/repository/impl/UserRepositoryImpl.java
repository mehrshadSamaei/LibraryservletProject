package ir.mehrshad.repository.impl;

import ir.mehrshad.base.repository.impl.BaseRepositoryImpl;
import ir.mehrshad.entity.User;
import ir.mehrshad.repository.UserRepository;

import javax.persistence.EntityManager;

public class UserRepositoryImpl extends BaseRepositoryImpl<Long , User> implements UserRepository {
    public UserRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
