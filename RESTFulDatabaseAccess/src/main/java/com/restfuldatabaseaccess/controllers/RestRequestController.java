package com.restfuldatabaseaccess.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestRequestController {

	@Autowired
	DatabaseRequestController databaseHandler;
	
	
	
	
	@RequestMapping(value="/getStudents" ,method=RequestMethod.GET)
	public String getStudents() {
		return "";
	}
}
