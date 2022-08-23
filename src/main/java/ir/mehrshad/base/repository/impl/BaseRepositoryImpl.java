package ir.mehrshad.base.repository.impl;

import ir.mehrshad.base.basedomain.BaseEntity;
import ir.mehrshad.base.repository.BaseRepository;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;
@RequiredArgsConstructor
public abstract class BaseRepositoryImpl<ID extends Serializable , E extends BaseEntity<ID>> implements BaseRepository<ID , E> {

    protected final EntityManager em;
    protected abstract Class<E> getEntityClass();

    @Override
    public E save(E e) {
        em.persist(e);
        return e;
    }

    @Override
    public E update(E e) {
        e = em.merge(e);
        return e;
    }

    @Override
    public void deleteById(ID id) {
        em.createQuery("select e from " + getEntityClass().getSimpleName() +" e where e.id =:id",getEntityClass())
                .setParameter("id" , id).executeUpdate();
    }

    @Override
    public E findById(ID id) {
        return em.find(getEntityClass() , id);
    }

    @Override
    public List<E> findAll() {
        return em.createQuery("select e from " + getEntityClass().getSimpleName() +  " e",getEntityClass())
                .getResultList();
    }

    @Override
    public void beginTransaction() {
            getEntityTransaction().begin();
    }

    @Override
    public void commitTransaction() {
            getEntityTransaction().commit();
    }

    @Override
    public void rollBackTransaction() {
    getEntityTransaction().rollback();
    }

    @Override
    public EntityTransaction getEntityTransaction() {
        return em.getTransaction();
    }
}
