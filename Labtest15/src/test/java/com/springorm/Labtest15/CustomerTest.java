package com.springorm.Labtest15;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.Labtest15.Dao.CustomerDao;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {
	static CustomerDao c;
	
	@BeforeAll
public static void beforeAll() {
		
	}
	@Test
public void testGetCustomer() {
		//negative test case
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationcontext.xml");
		c= (CustomerDao) a.getBean("CustomerDao");
		assertEquals(1, c.getCustomer(101).getPlist().size());
	}
	public void testG() {
		//positive test case
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationcontext.xml");
		c= (CustomerDao) a.getBean("CustomerDao");
		assertEquals(1, c.updateCustomer(101, "Golu"));
	}


}
