package com.dal;

import javax.persistence.*;

import com.model.Nome;

public abstract class NomeDao {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
    private static EntityManager em = emf.createEntityManager();

    public static void salvar(Nome nome) {
        try {
            em.getTransaction().begin();
            em.persist(nome);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
