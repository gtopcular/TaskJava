package com.javatask.enocaTask.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.javatask.enocaTask.DAO.IEmployeeDal;
import com.javatask.enocaTask.Entities.Employee;

@Service
public class EmployeeManager implements IEmployeeService {

	private IEmployeeDal employeeDal;
	
	
	@Autowired
	public EmployeeManager(IEmployeeDal employeeDal) {
		this.employeeDal = employeeDal;
	}
	
	@Override
	public List<Employee> getAll() {
		return this.employeeDal.getAll(); 
	}

	@Override
	public void add(Employee employee) {
		this.employeeDal.add(employee);
		
	}

	@Override
	public void update(Employee employee) {
		this.employeeDal.update(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		this.employeeDal.delete(employee);
		
	}

	@Override
	public int hesaplama(int yil, int yas, int maas) {
		return this.employeeDal.hesaplama(yil, yas, maas);
	}

}
