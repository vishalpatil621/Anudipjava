
public class RevsThread extends Thread{
	private FibonRevs fr;
	
	//Parameterized constructor
	   public RevsThread(FibonRevs fr) {
			super();
			this.fr = fr;
		}

	 //Run method
	 public void run()
	 {
		 fr.Revers();
	 }

}
