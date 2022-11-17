package com.TestLabtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.labtest11.ArrayListDemo;

public class ArrayListDemoTest {
	private static ArrayListDemo arr;
	
	@BeforeAll	
	public static void	beforeAllTests()
	{
		arr=new ArrayListDemo();
		System.out.println("Once Before all tests....");	
	}
		
	@BeforeEach	
	public void beforeEachTest()
	{
		System.out.println("Before each test....");
	}
    @Test
    public void testSize()
    {
    	 assertEquals(5,arr.isArrayList());
    	 
    }
    @Test
    public void testEmpty()
    {
    	 assertEquals(0,arr.isEmptyList());
    	 
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
