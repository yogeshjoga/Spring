package com.example.demo.sevice;

import java.util.List;

import com.example.demo.model.HighSchoolStudent;

public interface StudentService {
	List<HighSchoolStudent> showAllStudents();
	void saveStudent(HighSchoolStudent highSchoolStudent);
	
}
