package main.java.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.model.OwnerName;

public class OwnerNameHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MiniProject");
	
	public void insertOwnerName(OwnerName c) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<OwnerName> showAllOwnerNames() {
		EntityManager em = emfactory.createEntityManager();
		List<OwnerName> allOwnerNames = em.createQuery("SELECT c FROM OwnerNames c").getResultList();
		return allOwnerNames;
	}
}
