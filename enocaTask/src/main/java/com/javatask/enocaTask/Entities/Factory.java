package com.javatask.enocaTask.Entities;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="factory")
public class Factory {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name")
	private String sirketAdi;
	
	@OneToMany( mappedBy = "factory",cascade = CascadeType.REMOVE)
	private Set<Employee> employees;
	
	
	
	public Factory() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSirketAdi() {
		return sirketAdi;
	}

	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Factory(int id, String sirketAdi, Set<Employee> employees) {
		this.id = id;
		this.sirketAdi = sirketAdi;
		this.employees = employees;
	}
	
	      
}
