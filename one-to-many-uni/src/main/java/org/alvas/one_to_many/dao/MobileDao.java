package org.alvas.one_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class MobileDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prathiksha");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Mobile saveMobileSim(Mobile mobile, Sim sim1, Sim sim2) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
		return mobile;
	}

	public Mobile deleteMobileById(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Mobile mob = entityManager.find(Mobile.class, id);
		Sim sim = entityManager.find(Sim.class, mob.getId());
		entityTransaction.begin();
		entityManager.remove(sim);

		entityTransaction.commit();
		System.out.println("............Data deleted.........");
		return mob;

	}

	public Mobile getById(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Mobile mob = entityManager.find(Mobile.class, id);

		System.out.println(mob);

		return mob;
	}

	public Mobile updateById(int id, String name, String model) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Mobile mob = entityManager.find(Mobile.class, id);
//		Sim sim = entityManager.find(Sim.class, mob.getId());
//		sim.setName(name);
//		sim.setProvider(model);
		entityTransaction.begin();
		List<Sim> sims = mob.getSim();
		for(Sim sim :sims)
		{
			if(sim.getName().equals("Realme"))
			{
				sim.setName(name);
			}
		}
		mob.setName(name);
		//mob.setSim(sims);
		entityManager.merge(mob);
		entityManager.merge(sims);
		entityTransaction.commit();
		System.out.println("data updated");
		return mob;
	}
}