package com.example.demo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.model.HighSchoolStudent;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public List<HighSchoolStudent> showAllStudents() {
		
		return studentRepo.findAll();
	}
	@Override
	public void saveStudent(HighSchoolStudent highSchoolStudent) {
		this.studentRepo.save(highSchoolStudent);
		
	}

}
