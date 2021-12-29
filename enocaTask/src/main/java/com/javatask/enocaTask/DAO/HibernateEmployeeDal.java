package com.javatask.enocaTask.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javatask.enocaTask.Entities.Employee;

@Repository
public class HibernateEmployeeDal implements IEmployeeDal {

	private EntityManager entityManager;	
	
	@Autowired
	public HibernateEmployeeDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Employee> employees = session.createQuery("from Employee",Employee.class).getResultList();
		return employees;
	}

	@Override
	public void add(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
	}

	@Override
	public void update(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		Employee employeeToDelete = session.get(Employee.class, employee.getId());
		session.delete(employeeToDelete);
		
	}

}
