package com.javatask.enocaTask.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatask.enocaTask.DAO.IEmployeeDal;
import com.javatask.enocaTask.DAO.IFactoryDal;
import com.javatask.enocaTask.Entities.Factory;

@Service
public class FactoryManager implements IFactoryService {
	
	private IFactoryDal factoryDal;
	
	@Autowired
	public FactoryManager(IFactoryDal factoryDal) {
		this.factoryDal = factoryDal;
	}

	@Override
	public List<Factory> getAll() {
		return this.factoryDal.getAll();
	}

	@Override
	public void add(Factory factory) {
		this.factoryDal.add(factory);
		
	}

	@Override
	public void update(Factory factory) {
		this.factoryDal.update(factory);
		
	}

	@Override
	public void delete(Factory factory) {
		this.factoryDal.delete(factory);
		
	}

}
