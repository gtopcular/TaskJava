package com.javatask.enocaTask.Entities;





import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="employee")


public class Employee {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Socialnumber")
	private int sgknumarasi;
	
	@Column(name="Name")
	private String ad;
	
	@Column(name="Surname")
	private String soyad;
	
	@Column(name="Salary")
	private String maas;
	
	@Column(name="Birthdate")
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Fact_id")
	private Factory factory;
	
	public Employee()
	{}
	
	public Employee(int id, int sgknumarasi, String ad, String soyad, String maas, Factory factory) {
		this.id = id;
		this.sgknumarasi = sgknumarasi;
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
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

	public String getMaas() {
		return maas;
	}

	public void setMaas(String maas) {
		this.maas = maas;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
