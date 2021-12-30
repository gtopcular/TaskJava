package com.javatask.enocaTask.Entities;


import com.javatask.enocaTask.Entities.Factory;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="employee")


public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Socialnumber")
	private int sgknumarasi;
	
	@Column(name="Name")
	private String ad;
	
	@Column(name="Surname")
	private String soyad;
	
	@Column(name="Salary")
	private int maas;

	@Column(name="Age")
	private int yas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fact_id")
	private Factory factory;
	
	public Employee()
	{}
	
	public Employee(int id, int sgknumarasi, String ad, String soyad, int maas, int yas, Factory factory) {
		this.id = id;
		this.sgknumarasi = sgknumarasi;
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
		this.yas = yas;
		this.factory = factory;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSgknumarasi() {
		return sgknumarasi;
	}

	public void setSgknumarasi(int sgknumarasi) {
		this.sgknumarasi = sgknumarasi;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	
	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}


}
