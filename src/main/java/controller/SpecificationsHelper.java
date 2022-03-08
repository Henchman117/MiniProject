package main.java.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import main.java.model.Specifications;

public class SpecificationsHelper {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MiniProject");
	
	public Specifications searchForSpecsId(int idToEdit) {
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		Specifications found = em.find(Specifications.class, idToEdit);
		em.close();
		return found;
	}
	
	public List<Specifications> searchForHorsepower(int hp) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		TypedQuery<Specifications> typedQuery = em.createQuery("select c from specifications c where c.horsepower = :selectedHorsepower", Specifications.class); 
		typedQuery.setParameter("selectedColor", hp);
		List<Specifications> foundItems = typedQuery.getResultList(); em.close();
		return foundItems;
	}
	public List<Specifications> searchForTorque(int torque) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		TypedQuery<Specifications> typedQuery = em.createQuery("select c from specifications c where c.torque = :selectedTorque", Specifications.class); 
		typedQuery.setParameter("selectedColor", torque);
		List<Specifications> foundItems = typedQuery.getResultList(); em.close();
		return foundItems;
	}
	public List<Specifications> searchForDisplacement(Double displacement) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		TypedQuery<Specifications> typedQuery = em.createQuery("select c from specifications c where c.displacement = :selectedDisplacement", Specifications.class); 
		typedQuery.setParameter("selectedColor", displacement);
		List<Specifications> foundItems = typedQuery.getResultList(); em.close();
		return foundItems;
	}
	public List<Specifications> searchForMpg(int mpg) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		TypedQuery<Specifications> typedQuery = em.createQuery("select c from specifications c where c.milespergallon = :selectedMilespergallon", Specifications.class); 
		typedQuery.setParameter("selectedColor", mpg);
		List<Specifications> foundItems = typedQuery.getResultList(); em.close();
		return foundItems;
	}
	public void updateSpecs(Specifications toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		em.merge(toEdit); 
		em.getTransaction().commit(); 
		em.close();
	}
}
