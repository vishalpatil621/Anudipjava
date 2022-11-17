package com.TestLabtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.labtest11.AddMult;

public class AddMultTest {
	private static AddMult am;
	
	@BeforeAll	
	public static void	beforeAllTests()
	{
		am=new AddMult();
		System.out.println("Once Before all tests....");	
	}
		
	@BeforeEach	
	public void beforeEachTest()
	{
		System.out.println("Before each test....");
	}
	
	@Test
	public void testAdd()
	{
	    assertEquals(60,am.add(40,20));
		
	}
	@Test
	public void testMult()
	{
	    assertEquals(800,am.mult(40,20));
		
	}

	@AfterEach
	public void afterEachTest()
	{
		System.out.println("After each test....");
	}

	@AfterAll
	public static void afterAllTests()
	{
		System.out.println("Once After all tests....");	
	}

}
