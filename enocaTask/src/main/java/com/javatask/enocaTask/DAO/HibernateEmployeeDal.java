package com.javatask.enocaTask.DAO;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javatask.enocaTask.Entities.Employee;

@Repository
public class HibernateEmployeeDal implements IEmployeeDal {

	private EntityManager entityManager;	
	
	@Autowired
	public HibernateEmployeeDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Employee> employees = session.createQuery("from Employee",Employee.class).getResultList();
		return employees;
	}

	@Override
	@Transactional
	public void add(Employee employee) {
		System.out.println("AAAAAANEALAKA");
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		System.out.println("AAAAAAADAL");
		Session session = entityManager.unwrap(Session.class);
		session.update(employee);
		
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		Employee employeeToDelete = session.get(Employee.class, employee.getId());
		session.delete(employeeToDelete);
		
	}

	@Override
	public int hesaplama(int yil, int yas ,int maas) {
			for(int i=0; i < yil ; i++) {
				System.out.println(yil);
				System.out.println(yas);
				System.out.println(maas);
				System.out.println("iften önce");
				maas += maas*10/100;
				if(yas >= 20 && yas <= 25  ) 
				{
					System.out.println("1.aralik");
					maas += maas*10/100;
					yas += 1;
				} else if (yas >= 26 && yas <= 30 ) {
					System.out.println("ikinci aralik");
					maas += maas*8/100;
					yas += 1;
				} else if (yas >= 31 && yas <= 36) {
					System.out.println("ücüncü aralik");
					maas += maas*5/100;
					yas += 1;
				} else if (yas > 36) {
					System.out.println("son aralik");
					maas += maas*3/100;
					yas += 1;
				}
				System.out.println("Hesaplanan tutar : " + maas);
			}
			
		return maas;
	}




}
