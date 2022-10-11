package com.alvas.one_to_many_bi.dao;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alvas.one_to_many_bi.dto.Subject;
import com.alvas.one_to_many_bi.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prathiksha");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	public Teacher saveTeacherSubject(Teacher teacher,Subject subject)
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(subject);
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}

}
