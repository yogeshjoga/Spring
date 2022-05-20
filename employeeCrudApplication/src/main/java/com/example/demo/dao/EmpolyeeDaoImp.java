package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

/*
 *  add the class level annotation is @Repository
 *  and 
 *  goto the method level implement 
 *  
 *  develop the entity manager to implement a code to use
 *  
 */

public class EmpolyeeDaoImp implements EmpolyeeDao {

	private EntityManager entityManager;

	// this is the empty constructor y bcoz it will be invoke
	public EmpolyeeDaoImp() {

	}

	@Autowired
	public EmpolyeeDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	/*
	 * create the Hiberneat sessions it will crate a new object
	 * 
	 * we need to write 4 lines of codes
	 * 
	 * 1 create a Hibernet session 2 create a sql queary 3 excuted the queary 4
	 * return the results
	 */

	@Override
	@Transactional
	public List<Employee> emp() {
		// create a hiber session
		Session currentSession = entityManager.unwrap(Session.class);
		// create a sql query
		
		// Query<Employee> query = currentSession.createQuery("from employee", Employee.class);
		Query<Employee> query = (Query<Employee>) ((EntityManager) currentSession).createQuery("from Employee", Employee.class);
		// excute the query
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
