package ir.mehrshad.base.service;

import ir.mehrshad.base.basedomain.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<ID extends Serializable, E extends BaseEntity<ID>> {

    E updateOrSave(E e);

    void deleteById(ID id);

    E findById(ID id);

    List<E> findAll();

    void beginTransaction();

    void commitTransaction();

    void rollBack();

}
