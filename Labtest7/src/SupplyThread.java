
public class SupplyThread extends Thread{
	private Producer p;
	
	//Parameterized Constructor
    public SupplyThread(Producer p) {
	super();
	this.p = p;
}
    //Creating run method
    public void run()
    {
	  p.Supply(200);
    }

}
