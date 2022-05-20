package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.HighSchoolStudent;
import com.example.demo.sevice.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("listOfStudents",studentService.showAllStudents());
		return "index";
	}
	@GetMapping("/newStudent")
	public String newStudent(Model model) {
		HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
		model.addAttribute("student",highSchoolStudent);
		return "new_student";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") HighSchoolStudent student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}
}
