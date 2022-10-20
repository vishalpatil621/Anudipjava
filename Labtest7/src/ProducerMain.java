
public class ProducerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Creating object
		Producer pd=new Producer();
        DemandThread dt=new DemandThread(pd);
        SupplyThread st=new SupplyThread(pd);
        
        //Calling start method
        dt.start();
        st.start();
		
	}

}
