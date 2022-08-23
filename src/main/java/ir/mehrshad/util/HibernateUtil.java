package ir.mehrshad.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("default");

    private static EntityManager entityManager;

    private HibernateUtil() {
    }

    public static EntityManager getEntityManager() {
        if (entityManager==null){
            entityManager=emf.createEntityManager();
        }

        System.out.printf("conected successful");
        System.out.println();
        return entityManager;
    }
}
