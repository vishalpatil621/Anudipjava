
public class FibonThread extends Thread{
	private FibonRevs fr;
	
	//Parameterized constructor
	   public FibonThread(FibonRevs fr) {
			super();
			this.fr = fr;
		}
     //Run method
	 public void run()
	 {
		 fr.Fibonacci(10);
	 }

}
