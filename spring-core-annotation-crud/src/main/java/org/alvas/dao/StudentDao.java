package org.alvas.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.alvas.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentDao {
	@Autowired
	Student student;
	@Autowired
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	public Student saveStudent(Student student)
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	public Student deletStudent(Student student)
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return student;
	}
}
