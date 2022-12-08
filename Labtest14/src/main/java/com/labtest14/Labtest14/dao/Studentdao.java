package com.labtest14.Labtest14.dao;
import java.sql.SQLException;

import com.labtest14.Labtest14.entities.Student;

public interface Studentdao {
	
	//To Create Student
	int createStudent(Student st)throws SQLException;
	
	//To Display Student
	Student getStudent(int sid) throws SQLException;
    
	//To Delete Student
    boolean deleteStudent(int sid)throws SQLException;
    
    //To Update Student
    boolean updateStudent(int sid,String sname)throws SQLException;

}
