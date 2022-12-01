package com.Springorg.Labtest13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.Springorg.Labtest13.dao.userdao;
import com.Springorg.Labtest13.daoimpl.userdaoimpl;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	userdao udao = new userdaoimpl();

    	System.out.println("1. To Create user:");
		System.out.println("2. To View user:");
		System.out.println("3. To List all user:");
		System.out.println("4. To Update user:");
		System.out.println("5. To Delete user:");
		System.out.println("9. To Exit:");

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Choice... :");
			int ch = scan.nextInt();
			int i = 0;
			switch (ch) {
			case 1: {
				scan.nextLine();
				System.out.println("Enter your username");
				String user_name = scan.nextLine();
				System.out.println("Enter your password");
				String password = scan.next();
				if (password.length() >= 6) {
					i = udao.createUser(user_name, password);
					System.out.println("Inserted....");
				}else
				System.out.println("Enter valide password...");
				break;
			}
			case 2:
				System.out.println("Enter the username which user  want to see");
				String disp = scan.next();
				udao.displayUser(disp);
				break;
			case 3:
				udao.displayAllUser();
				break;
			case 4: {
				scan.nextLine();
				System.out.println("Enter the username  where you update the record ");
				String user_name = scan.nextLine();
				System.out.println("Enter the password which you want to update");
				String password = scan.nextLine();
				i = udao.updatePassword(user_name, password);
				System.out.println(i + " Record updated..");
				break;
			}
			case 5: {
				scan.nextLine();
				System.out.println("Enter the username which user  want to delete");
				String s= scan.nextLine();
				i = udao.deleteUser(s);
				System.out.println(i + " Record deleted..");
				break;
			}
			case 9:
				
				System.out.println("Exit database....");
				System.exit(0);

			default:
				System.out.println("Enter valid choice...");

			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}