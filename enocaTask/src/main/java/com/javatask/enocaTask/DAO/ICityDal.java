package com.javatask.enocaTask.DAO;

import java.util.List;

import com.javatask.enocaTask.Entities.City;


public interface ICityDal {
	List<City> getAll();
	void add (City city);
	void update(City city);
	void delete (City city);
}
