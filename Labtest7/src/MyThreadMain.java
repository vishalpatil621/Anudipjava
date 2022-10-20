
public class MyThreadMain {

	public static void main(String[] args) {
		
		// Creating object
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		//calling start method
		t1.start();
		t2.start();
		t3.start();

	}

}
