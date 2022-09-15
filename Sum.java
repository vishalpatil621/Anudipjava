
public class Sum {

	int c;
	void add(int a)
	{
		 int c = 0;

	        for(int i= 1; i<= a; i++)
	        {    
	            c =c+i;
	            
	        }
	        System.out.println("Addition of number 1 to 100 is ="+c);  	
		 
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sum s=new Sum();
     s.add(100);
	}

}