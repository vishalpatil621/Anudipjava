
public class DemandThread extends Thread{
	private Producer p;
	
	//Parameterized Constructor
    public DemandThread(Producer p) {
	super();
	this.p = p;
}

  //Creating run method
    public void run()
    {
	  p.Demand(200);
    }

}
