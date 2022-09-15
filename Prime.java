
public class Prime {
   
   int i,j,count=0;
	void num(int a)
	{
		for(int i=2;i<=20;i++)
		{
		   count=0;
		   for(j=2;j<i;j++)
		   {  
			if(i%j==0)
			{
				
				count++;
				break;
				
			}
		   }
		   if(count==0)
		   {
			   System.out.println(i);
			      
		   }
		
		}
		
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Prime p=new Prime();
         p.num(20);
         System.out.println("Prime number between 1 to 20");
	}

}
