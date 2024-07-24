package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

//@Service
public class MyServiceEntityManager {

 // @Autowired
  private EntityManagerFactory entityManagerFactory;

  public void persistData(MyServiceEntityManager entity) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    try {
      entityManager.persist(entity);
      entityManager.getTransaction().commit();
    } finally {
      if (entityManager.getTransaction().isActive()) {
        entityManager.getTransaction().rollback();
      }
      entityManager.close();
    }
  }
}
