package com.labtest11;

public class Palindrome {

	public boolean isPalindrome(String n)
	{
		String rev="";
		 
        // Initializing a new boolean variable for the
		 for (int i=n.length()-1;i>=0;i--)
		 {
	            rev=rev+n.charAt(i);
		 }
      
		if(n.contentEquals(rev))    
            return true; 
        else    
            return false;  
	
	}
}
