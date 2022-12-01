package com.Springorg.Labtest13.dao;
import java.sql.SQLException;

public interface userdao {
	
	    // Create user 
		int createUser(String user_name ,String password) throws SQLException;
		
		//to display user
		void displayUser(String  user_name) throws SQLException;
		
		//to display all user
		void displayAllUser() throws SQLException;
		
		//update password
		int updatePassword(String user_name ,String password) throws SQLException;
		
		//to delete user
		int deleteUser(String user_name)throws SQLException;
	
}
