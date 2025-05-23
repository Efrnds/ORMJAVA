/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.ifpr;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class ExemploORM {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ifpr_db");

        EntityManager em = emf.createEntityManager();

        Categoria c = new Categoria();
        c.setNome("Carros");

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Hello World!");
    }
}
