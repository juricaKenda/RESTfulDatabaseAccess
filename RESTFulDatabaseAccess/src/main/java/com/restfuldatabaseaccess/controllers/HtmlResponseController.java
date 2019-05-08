package com.restfuldatabaseaccess.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restfuldatabaseaccess.entities.StudentRepo;

@Controller
public class HtmlResponseController {


	StudentRepo repo = new StudentRepo(); 
	
	@RequestMapping(value="/test")
	public String test(Model model) {
		model.addAttribute("message","Hello World!");
		return "test";
	}
	
	
	@RequestMapping(value="/table")
	public String getStudents(Model model) {
		model.addAttribute("students",repo.getStudents());
		return "students";
	}
	
	
}
