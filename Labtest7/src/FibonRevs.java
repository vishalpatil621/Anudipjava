
public class FibonRevs {
	
	synchronized public void Fibonacci(int n)
	{
		
			int a=0,b=1,c=0;
			
			for(int i=0;i<=10;i++)    //find fibonacci series
			{
				c=a+b;
				
				System.out.println("Fibonacci = "+c);
				a=b;
				b=c;
			}
			
		   }
	
	
	synchronized public void Revers()
	{   
		//Use to Revers the number
		
		for(int i=10;i>=0;i--)
		{
			System.out.println("Revers = "+i);
		}
	}

}
