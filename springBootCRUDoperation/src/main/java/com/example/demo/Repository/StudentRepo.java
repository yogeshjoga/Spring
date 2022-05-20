package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HighSchoolStudent;
@Repository
public interface StudentRepo extends JpaRepository<HighSchoolStudent, Long>{
	
	/*
	 * must be datatype will captial letter y bcoz it will take the basebase datatypes
	 * so don't confuse this okay
	 */
	
	

}
