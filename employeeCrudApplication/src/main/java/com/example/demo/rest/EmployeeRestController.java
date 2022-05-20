package com.example.demo.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmpolyeeDao;
import com.example.demo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	@RequestMapping()
	public String welcome() {
		return "hello server is updated";
	}
	//emp dao
	private EmpolyeeDao empolyeeDao;
	
	// consturctor injection by using the @Autowired

	@Autowired
	public EmployeeRestController(EmpolyeeDao empolyeeDao) {
		super();
		this.empolyeeDao = empolyeeDao;
	}
	
	
	// return list of the emp
	public List<Employee> findAll(){
		// emp method from empolyeeDao interface
		return empolyeeDao.emp();
	}
	

}
