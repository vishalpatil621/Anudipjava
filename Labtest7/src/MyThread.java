
public class MyThread extends Thread{
	private String name;
	
	//Default Constructor
	public MyThread() {
		super();
		
	}
	
	//Parameterized Constructor
	public MyThread(String name) {
		super();
		this.name = name;
	}
     
	//Creating run method
	public void run()
	{
		String s[]={"A","B","C","D","E","F","G","H","I","J"};
		
		//Printing an array
		for(int i=0;i<s.length;i++)  
		{
			System.out.println("Name of 10 Friends = "+s[i]);
		}
	}

}
