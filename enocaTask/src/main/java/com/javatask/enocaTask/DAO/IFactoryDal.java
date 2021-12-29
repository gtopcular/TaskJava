package com.javatask.enocaTask.DAO;

import java.util.List;

import com.javatask.enocaTask.Entities.Factory;

public interface IFactoryDal {
	List<Factory> getAll();
	void add (Factory factory);
	void update(Factory factory);
	void delete (Factory factory);

}
