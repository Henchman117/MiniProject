package main.java.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import main.java.model.Car;
import main.java.model.Specifications;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Mar 2, 2022
 */
public class CarHelper {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MiniProject");
	
	public CarHelper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addCar(Car c) {
		EntityManager e = emf.createEntityManager();
		e.getTransaction().begin();
		e.persist(c);
		e.getTransaction().commit();
		e.close();
	}
	public List<Car> displayCars() {
		EntityManager e = emf.createEntityManager();
		List<Car> cars = e.createQuery("SELECT c FROM Car c").getResultList();
		return cars;
	}
	public Car searchForCarId(int idToEdit) {
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		Car found = em.find(Car.class, idToEdit);
		em.close();
		return found;
	}
}
