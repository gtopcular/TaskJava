package com.javatask.enocaTask.Service;

import java.util.List;

import com.javatask.enocaTask.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add (City city);
	void update(City city);
	void delete (City city);
}
