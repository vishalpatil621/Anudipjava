package com.Anudip;

public class Matrix {

	void mult()
	{
	
	int a[][]= {{2,3,4,5,6},{7,3,6,8,2}};
	int b[][]= {{4,6,8,2,9},{9,3,7,1,5}};
	int c[][]=new int [5][5];
	
	for(int i=0;i<a.length;i++) 
	{
		for(int j=0;j<a[i].length;j++)
		{
			c[i][j]=a[i][j]*b[i][j];
			System.out.print(c[i][j]+"  ");
			
		}
		System.out.println(" ");
		
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m=new Matrix();
		m.mult();
		
	}


}
