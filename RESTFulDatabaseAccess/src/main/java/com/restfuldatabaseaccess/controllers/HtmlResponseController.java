package com.restfuldatabaseaccess.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restfuldatabaseaccess.entities.Student;
import com.restfuldatabaseaccess.entities.StudentRepo;

@Controller
public class HtmlResponseController {


	StudentRepo repo = new StudentRepo(); 
	
	@RequestMapping(value="/test")
	public String test(Model model) {
		model.addAttribute("message","Hello World!");
		return "test";
	}
	
	
	@GetMapping(value="/table")
	public String getStudents(Model model) {
		model.addAttribute("studentsinfo",repo.getStudents());
		model.addAttribute("stud", new Student());
		return "students";
	}
	
	@PostMapping(value="/table")
	public String getStudents(Model model,@ModelAttribute Student student) {
		List<Student> filtered = repo.getStudents()
									 .stream()
									 .filter(x -> x.getIme().equals(student.getIme()))
									 .collect(Collectors.toList());
		model.addAttribute("studentsinfo",filtered);
		return "studentsfiltered";
	}
	
	
	
}
