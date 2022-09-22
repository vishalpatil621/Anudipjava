package com.Anudip;


public class Arrays {

	int[] joinArrays(int[] a,int[] b)
	{
		int size;
		
		if(a.length>b.length)
			size=b.length;
		else
			size=a.length;	
		
		int[] c=new int[size];
		
		for(int i=0;i<size;i++) 
		{
			c[i]=a[i]+b[i];  
			
		}
		
		return c;
	}
	 
	public int add(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Arrays ar=new Arrays();
				
		 int [] s=ar.joinArrays(new int[] {2,4,5,6,7}, new int[] {5,6,8,2,8});
		
		for(int i:s)
		{
		   System.out.println(i);	
		}
		
		 System.out.println("Addition of two array is ="+ar.add(s));
	}

}
