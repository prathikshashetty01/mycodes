package org.alvas.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.avlas.one_to_one.dto.Aadhar;
import org.avlas.one_to_one.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prathiksha");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	//save person and aadhar
	public Person savePerson(Person person,Aadhar aadhar)
	{
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadhar);
		entityTransaction.commit();
		System.out.println("data stored");
		return person;
	}
	public Person getPersonAadhar(int id)//get aadhar and personal details
	{
		entityManager= entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class,id);
		return person;
	}
	public Person deletById(int id)//get aadhar and personal details
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, id);
		Aadhar aadhar = entityManager.find(Aadhar.class, person.getAadhar().getId());
	    entityManager.remove(person);
	    entityManager.remove(aadhar);
	    entityTransaction.begin();
	    entityTransaction.commit();
	    System.out.println("deleted");
		return person;
	}
	public Person UpdateById(int id,String name,long aadharnumber)//get aadhar and personal details
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, id);
		person.setName(name);
		Aadhar aadhar = entityManager.find(Aadhar.class,person.getAadhar().getId());
		aadhar.setAadharnumber(aadharnumber);
		person.setAadhar(aadhar);
		entityTransaction.begin();
	    entityManager.merge(person);
	    entityManager.merge(aadhar);
	    entityTransaction.commit();
	    System.out.println("updated");
		return person;
	}
}
