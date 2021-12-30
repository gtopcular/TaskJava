package com.javatask.enocaTask.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javatask.enocaTask.Entities.City;
import com.javatask.enocaTask.Entities.Employee;
import com.javatask.enocaTask.Entities.Factory;

@Repository
public class HibernateFactoryDal implements IFactoryDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateFactoryDal(EntityManager entityManager) {
		this.entityManager= entityManager;
	}

	@Override
	@Transactional
	public List<Factory> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Factory> factories = session.createQuery("from Factory",Factory.class).getResultList();
		return factories;
	}

	@Override
	@Transactional
	public void add(Factory factory) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(factory);
		
	}

	@Override
	@Transactional
	public void update(Factory factory) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(factory);
		
	}

	@Override
	@Transactional
	public void delete(Factory factory) {
		Session session = entityManager.unwrap(Session.class);
		Factory factoryToDelete = session.get(Factory.class, factory.getId());
		session.delete(factoryToDelete);
		
	}

}
