//Write a program to check whether a given string is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
	
	void palindrome(String str)
	{
		String rev="";
		 
        // Initializing a new boolean variable for the
		 for (int i = str.length() - 1; i >= 0; i--)
		 {
	            rev = rev + str.charAt(i);
		 }
      
		if(str.contentEquals(rev))    
            System.out.println("String is palindrome");    
        else    
            System.out.println("String is not a palindrome");  
	}
	
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		str=str.toLowerCase(); 
		Palindrome pa=new Palindrome();
         pa.palindrome(str);
	}

}
