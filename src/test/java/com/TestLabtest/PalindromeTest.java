package com.TestLabtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.labtest11.Palindrome;

public class PalindromeTest {
	private static Palindrome p;
	
	@BeforeAll	
	public static void	beforeAllTests()
	{
		p=new Palindrome();
		System.out.println("Once Before all tests....");	
	}
		
	@BeforeEach	
	public void beforeEachTest()
	{
		System.out.println("Before each test....");
	}
	

	@ParameterizedTest
	@ValueSource(strings = {"asa","dad","mom","pop"})
	public void testPalindrome(String n)
	{
	   System.out.println("c= :" + n);
		assertTrue(p.isPalindrome(n));
		
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
