package ir.mehrshad.base.repository;

import ir.mehrshad.base.basedomain.BaseEntity;

import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;


public interface BaseRepository<ID extends Serializable, E extends BaseEntity<ID>> {

    E save(E e);

    E update(E e);

    void deleteById(ID id);

    E findById(ID id);

    List<E> findAll();

    void beginTransaction();

    void commitTransaction();

    void rollBackTransaction();

    EntityTransaction getEntityTransaction();

}
