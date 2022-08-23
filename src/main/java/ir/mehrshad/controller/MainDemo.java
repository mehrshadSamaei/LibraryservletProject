package ir.mehrshad.controller;

import ir.mehrshad.util.HibernateUtil;

import javax.persistence.EntityManager;

public class MainDemo {
    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
    }
}
