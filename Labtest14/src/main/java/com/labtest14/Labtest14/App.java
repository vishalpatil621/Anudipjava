package com.labtest14.Labtest14;

import java.sql.SQLException;
import java.util.Scanner;

import com.labtest14.Labtest14.daoimpl.Studentdaoimpl;
import com.labtest14.Labtest14.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Studentdaoimpl stu = new Studentdaoimpl();
		System.out.println("1. To Create Student:");
		System.out.println("2. To Get Student:");
		System.out.println("3. To Delete Student:");
		System.out.println("4. To Update Student:");

		Student st=new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Choice :");
		int ch = scan.nextInt();
		
       
		switch(ch) {
		case 1:{			
			scan.nextLine();
			System.out.println("Enter your Student id");
			int sid = scan.nextInt();
			st.setSid(sid);
			scan.nextLine();
			System.out.println("Enter your Student Name");
			String sname = scan.nextLine();
			st.setSname(sname);
			System.out.println("Enter Your Contact");
			String contact = scan.nextLine();
			st.setContact(contact);
			stu.createStudent(st);
			
			break;
		}
		case 2:{
			System.out.println("Enter the Studend Id which you want to see");
			int id = scan.nextInt();
			st=stu.getStudent(id);
			System.out.println(st);
			break;
		}
		case 3:{
			scan.nextLine();
			System.out.println("Enter the Student Id which you want to delete");
			int sid = scan.nextInt();
			stu.deleteStudent(sid);
			System.out.println(" Record deleted..");
			break;
		}
		case 4:{
			scan.nextLine();
			System.out.println("Enter the Student Id  which you want to update");
			int id = scan.nextInt();
			System.out.println("Enter name you want to update");
			scan.nextLine();
			String name=scan.nextLine();
			stu.updateStudent(id,name);
			System.out.println(" Record updated..");
			break;
		}
		default:
			System.out.println("Enter Valid Choice...");

		}
}
}