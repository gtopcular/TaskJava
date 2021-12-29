package com.javatask.enocaTask.Service;

import java.util.List;

import com.javatask.enocaTask.Entities.Factory;

public interface IFactoryService {
	
	List<Factory> getAll();
	void add (Factory factory);
	void update(Factory factory);
	void delete (Factory factory);

}
