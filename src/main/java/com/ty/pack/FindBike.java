package com.ty.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBike {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Bike bike=entityManager.find(Bike.class, 1);
		if(bike!=null) {
			System.out.println("Bike id:"+bike.getId());
			System.out.println("Bike name:"+bike.getName());
			System.out.println("Bike cost:"+bike.getCost());
			System.out.println("*******************");
		}
		Charcy charcy=bike.getCharcy();
		if(charcy!=null) {
			System.out.println("Charcy id:"+charcy.getId());
			System.out.println("Charcy type:"+charcy.getType());
		}

	}

}
