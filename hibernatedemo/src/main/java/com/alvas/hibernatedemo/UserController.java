package com.alvas.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserController {
//hibernate with jpa

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prathiksha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = new User();
		user.setId(102);
		user.setName("ram");
		user.setEmail("ram123@gmail.com");
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		System.out.println("data stored");
	}

}
