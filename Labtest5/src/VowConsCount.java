
//Write a program to count the total number of vowels and consonants present in the given string.


import java.util.Scanner;

public class VowConsCount {
	
	
	static void  countVowCons(String str)
	{
		int vCount=0;
		int cCount=0;
		for(int i = 0; i < str.length(); i++) 
		{  
            //Checks whether a character is a vowel  
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {  
                
                vCount++;   //Increments the vowel counter 
            }
            
            //Checks whether a character is a consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
            {    
                
                cCount++;  //Increments the consonant counter  
            }  
        }  
        System.out.println("Number of Vowels: " + vCount);  
        System.out.println("Number of Consonants: " + cCount);  
    }  
	public static void  main(String[] args)
	{
		VowConsCount cv=new VowConsCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		cv.countVowCons(str);
		
		
	}

}
	

	

	
