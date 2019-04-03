package com.restfuldatabaseaccess.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.restfuldatabaseaccess.interfaces.StudAdminDAO;

@Repository
public class DatabaseRequestController implements StudAdminDAO{

	private String url,user,password;
	private boolean databaseInfoPulled;
	private Connection databaseConnection;
	
	
	
	
	@Override
	public void connectToStudAdmin() {
		try {
			if(!databaseInfoPulled) {
				pullDatabaseInfo();
			}
			databaseConnection = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private void pullDatabaseInfo() {
		File infoFile = new File("src/main/resources/DatabaseConnectionInfo.txt");
		try (Scanner fileScanner = new Scanner(infoFile)){
			this.url = fileScanner.nextLine();
			this.user = fileScanner.nextLine();
			this.password = fileScanner.nextLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String performQuery(String SQLQuery,String[] resultColumnNames) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
