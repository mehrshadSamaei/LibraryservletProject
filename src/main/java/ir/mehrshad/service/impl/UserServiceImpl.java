package ir.mehrshad.service.impl;

import ir.mehrshad.base.service.impl.BaseServiceImpl;
import ir.mehrshad.entity.User;
import ir.mehrshad.repository.impl.UserRepositoryImpl;
import ir.mehrshad.service.UserService;

public class UserServiceImpl extends BaseServiceImpl<Long , User, UserRepositoryImpl> implements UserService {
    public UserServiceImpl(UserRepositoryImpl repository) {
        super(repository);
    }
}
