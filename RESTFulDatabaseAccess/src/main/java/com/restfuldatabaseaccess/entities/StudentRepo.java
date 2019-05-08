package com.restfuldatabaseaccess.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.restfuldatabaseaccess.controllers.DatabaseRequestController;

public class StudentRepo {

	DatabaseRequestController databaseHandler = new  DatabaseRequestController();
	private List<Student> students  = new ArrayList<Student>();
	
	public StudentRepo() {
		students = databaseHandler.getStudents();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
