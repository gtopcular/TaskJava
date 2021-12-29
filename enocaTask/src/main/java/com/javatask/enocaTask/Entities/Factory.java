package com.javatask.enocaTask.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="factory")
public class Factory {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String sirketAdi;
	
	@OneToMany( mappedBy = "factory",
			cascade = CascadeType.ALL,
	        orphanRemoval = true
	        )
	private List<Employee> employees;
	
	
	
	public Factory() {

	}

	public Factory(int id, String sirketAdi, List<Employee> employees) {
		this.id = id;
		this.sirketAdi = sirketAdi;
		this.employees = employees;
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	      
}
