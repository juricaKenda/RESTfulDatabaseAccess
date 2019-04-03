package com.restfuldatabaseaccess.interfaces;

public interface StudAdminDAO {

	void connectToStudAdmin();
	String performQuery(String SQLQuery,String[]resultColumnNames);
	
	
}
