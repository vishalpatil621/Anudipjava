package com.Anudip;

public class Calculator {

	
	public int addition(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public double addition(double...a)
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public int substraction(int sum,int...b)
	{
		
		for(int i=0;i<b.length;i++)
		{
			sum-=b[i];
		}
		return sum;
	}
	
	public double substraction(int sum,double...b)
	{
		
		for(int i=0;i<b.length;i++)
		{
			sum-=b[i];
		}
		return sum;
	}
	
	public int multiplication(int sum,int...c)
	{
		
		for(int i=0;i<c.length;i++)
		{
			sum*=c[i];
		}
		return sum;
	}
	
	public double multiplication(int sum,double...c)
	{
		
		for(int i=0;i<c.length;i++)
		{
			sum*=c[i];
		}
		return sum;
	}
	
	public int division(int sum,int...d)
	{
		
		for(int i=0;i<d.length;i++)
		{
			sum/=d[i];
		}
		return sum;
	}
	
	public double division(int sum,double...d)
	{
		
		for(int i=0;i<d.length;i++)
		{
			sum/=d[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		
		System.out.println("Addition ="+c.addition(4,5));
		System.out.println("Substraction ="+c.substraction(50,40));
		System.out.println("Multiplication ="+c.multiplication(7,3));
		System.out.println("Division ="+c.division(20,5));
	
		System.out.println("     ");
		
	    System.out.println("Addition ="+c.addition(20.0,30.0));
	    System.out.println("Substraction ="+c.substraction(30,10.0));
	    System.out.println("Multiplication ="+c.multiplication(2,3.0));
	    System.out.println("Division ="+c.division(40,2.0));
	
	}
}
