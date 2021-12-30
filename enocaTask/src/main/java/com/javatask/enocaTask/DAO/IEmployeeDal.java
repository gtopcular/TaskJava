package com.javatask.enocaTask.DAO;

import java.util.List;

import com.javatask.enocaTask.Entities.Employee;

public interface IEmployeeDal {
	List<Employee> getAll();
	void add (Employee employee);
	void update(Employee employee);
	void delete (Employee employee);
	int hesaplama(int yil, int yas ,int maas);
}
