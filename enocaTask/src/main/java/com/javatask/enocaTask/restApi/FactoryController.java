package com.javatask.enocaTask.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatask.enocaTask.Entities.Employee;
import com.javatask.enocaTask.Entities.Factory;
import com.javatask.enocaTask.Service.IFactoryService;

@RestController
@RequestMapping("api/factory")
public class FactoryController {
	
	private IFactoryService factoryService;
	
	@Autowired
	public FactoryController(IFactoryService factoryService) {
		this.factoryService = factoryService;
	}
	
	@GetMapping("/factories")
	public List<Factory> get(){
		return factoryService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Factory factory) {
		factoryService.add(factory);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Factory factory) {
		factoryService.update(factory);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Factory factory) {
		factoryService.delete(factory);
	}

}
