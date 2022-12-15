package com.springorm.Labtest15;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.Labtest15.Dao.ProductDao;
import com.springorm.Labtest15.Dao.CustomerDao;
import com.springorm.Labtest15.Entities.Product;
import com.springorm.Labtest15.Entities.Customer;

public class App 
{
	
    public static void displayMenu() {
    	Scanner s=new Scanner(System.in);
    	ApplicationContext a= new ClassPathXmlApplicationContext("applicationcontext.xml") ;
		CustomerDao cst=(CustomerDao) a.getBean("CustomerDao");
		Customer c1=(Customer) a.getBean("Customer1");
		ProductDao pt=(ProductDao) a.getBean("ProductDao");
		Product p1=(Product) a.getBean("Product1");
		System.out.println("Enter choice\n "
				+ "1.Insert Customer or product\n"
				+ "2.update Customer or product\n"
				+ "3.delete Customer or product\n"
				+ "4. View Customer or product\n"
				+ "5.View all Customer or product\\n");
		int i=s.nextInt();
		int id ;
		switch (i){
		
		case 1:
			i=pt.insertProduct(p1); 
			//i=cst.insertCustomer(c1);
			System.out.println(i+ "record successfully inserted");
			break;
		case 2:
			System.out.println("Enter id no to be updated ");
			id =s.nextInt();
			System.out.println("Enter id no to be updated ");
			String name=s.next();
			 i=cst.updateCustomer(id,name);
			System.out.println(i+ "record successfully inserted");
			break;
		case 3:
			i=cst.deleteCustomer(c1);
			System.out.println(i+ "record successfully inserted");
			break;
		case 4:
			System.out.println("Enter id no to be view customer ");
			 id =s.nextInt();
			System.out.println(cst.getCustomer(id));
			break;
		case 5:
			
			System.out.println(cst.getAllCustomer());
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
    }
    public static void main( String[] args )
    {
    	displayMenu();
    }

}
