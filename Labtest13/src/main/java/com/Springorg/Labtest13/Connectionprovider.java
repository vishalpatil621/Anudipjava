package com.Springorg.Labtest13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionprovider {

	public static Connection getConnection()
	  {
		 try {
			 
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/labtest13","root","Vishal@621");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		 
		  
	  }
}
