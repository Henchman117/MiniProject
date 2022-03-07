package main.java.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import main.java.model.Owner;

public class OwnerHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MiniProject");
	
	public void addOwner(Owner o) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Owner> getOwner() {
		EntityManager em = emfactory.createEntityManager();
		List<Owner> allOwners = em.createQuery("SELECT o FROM Owner o").getResultList();
		return allOwners;
	}
	
	public void deleteOwner(Owner toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Owner> typedQuery = em.createQuery("select own from Owner own where own.id = :selectedId", Owner.class);
		
		typedQuery.setParameter("selectedId", toDelete.getId());
		
		typedQuery.setMaxResults(1);
		
		Owner result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		System.out.println("Successful Delete");
		em.close();
	}
	
	public Owner searchForOwnerById(Integer tempId) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Owner found = em.find(Owner.class, tempId);
		em.close();
		return found;
	}
	
	public OwnerHelper() {
		super();
	}
}
