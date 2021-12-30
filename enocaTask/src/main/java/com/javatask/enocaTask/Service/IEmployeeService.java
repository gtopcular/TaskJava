package com.javatask.enocaTask.Service;

import java.util.List;

import com.javatask.enocaTask.Entities.Employee;

public interface IEmployeeService {
	
	List<Employee> getAll();
	void add (Employee employee);
	void update(Employee employee);
	void delete (Employee employee);
	int hesaplama (int yil, int yas ,int maas);

}
