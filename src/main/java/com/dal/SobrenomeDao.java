package com.dal;

import javax.persistence.*;

import com.model.Sobrenome;

public abstract class SobrenomeDao {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
    private static EntityManager em = emf.createEntityManager();

    public static void salvar(Sobrenome sobrenome) {
        try {
            em.getTransaction().begin();
            em.persist(sobrenome);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
