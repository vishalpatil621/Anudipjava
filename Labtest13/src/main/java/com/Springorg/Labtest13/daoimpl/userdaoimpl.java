package com.Springorg.Labtest13.daoimpl;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Springorg.Labtest13.Connectionprovider;
import com.Springorg.Labtest13.dao.userdao;

public class userdaoimpl implements userdao{
	
	Connection con=Connectionprovider.getConnection();

	@Override
	public int createUser(String user_name, String password) throws SQLException {
		String query="insert into user(user_name,password) values(?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, user_name);
		ps.setString(2, password);
		int i=ps.executeUpdate();
		return i;
	}

	@Override
	public void displayUser(String user_name) throws SQLException {
		String query="Select * from user where user_name=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, user_name);
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println("user_name :"+rs.getString(1));
		System.out.println("password :"+rs.getString(2));
		
	}

	@Override
	public void displayAllUser() throws SQLException {
		String query="Select * from user";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
		System.out.println("user_name :"+rs.getString(1));
		System.out.println("password :"+rs.getString(2));
		System.out.println("......................................................");
		}	
	}

	@Override
	public int updatePassword(String user_name, String password) throws SQLException {
		String query="update user set password=(?) where user_name=(?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,password);
		ps.setString(2, user_name);
		int i=ps.executeUpdate();
		return i;
	}

	@Override
	public int deleteUser(String user_name) throws SQLException {
		String query="delete from  user where user_name=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, user_name);
		int i =ps.executeUpdate(); 
		return i;
	}


}
