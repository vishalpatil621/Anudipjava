
public class FibonRevsMain {

	public static void main(String[] args) {
		// Creating object
		FibonRevs f=new FibonRevs();
		FibonThread ft=new FibonThread(f);
		RevsThread rt=new RevsThread(f);
		
		//calling start method
		ft.start();
		rt.start();

	}

}
