package com.ty.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBikeCharcy {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setName("Access 125");
		bike.setCost(45000);

		Charcy charcy = new Charcy();
		charcy.setType("Ladder");

		bike.setCharcy(charcy);
		charcy.setBike(bike);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(charcy);
		entityTransaction.commit();
	}

}
