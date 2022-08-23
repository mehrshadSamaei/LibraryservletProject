package ir.mehrshad.base.service.impl;

import ir.mehrshad.base.basedomain.BaseEntity;
import ir.mehrshad.base.repository.impl.BaseRepositoryImpl;
import ir.mehrshad.base.service.BaseService;
import lombok.RequiredArgsConstructor;

import javax.persistence.PersistenceException;
import java.io.Serializable;
import java.util.List;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<ID extends Serializable, E extends BaseEntity<ID>, R extends BaseRepositoryImpl<ID, E>> implements BaseService<ID, E> {
    protected final R repository;

    @Override
    public E updateOrSave(E e) {
        try {
            if (e.getId() == null) {
                repository.beginTransaction();
                repository.save(e);
            } else {
                e = repository.update(e);
                repository.commitTransaction();
            }
            return e;
        } catch (PersistenceException ex) {
            ex.printStackTrace();
            rollBack();
            return null;
        }
    }

    @Override
    public void deleteById(ID id) {
        try {
            repository.beginTransaction();
            repository.deleteById(id);
            repository.commitTransaction();
        }catch (IllegalArgumentException exception){
            exception.printStackTrace();
            repository.rollBackTransaction();
        }
    }

    @Override
    public E findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public void beginTransaction() {
        if (!repository.getEntityTransaction().isActive())
            repository.beginTransaction();
    }

    @Override
    public void commitTransaction() {
        if (repository.getEntityTransaction().isActive())
            repository.commitTransaction();
    }

    @Override
    public void rollBack() {
        repository.rollBackTransaction();
    }
}
