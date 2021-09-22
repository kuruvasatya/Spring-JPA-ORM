package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Alien;

public class AlienService {
	
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("pu");
	EntityManager em = emf.createEntityManager();
	
	public Alien get(int id)
	{
		return em.find(Alien.class, id);
	}
	
	public void insert(Alien alien)
	{
		em.getTransaction().begin();
		em.persist(alien);
		em.getTransaction().commit();
	}
	
}
