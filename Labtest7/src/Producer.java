
public class Producer {
	private int availableProduct=100;
	
	//Creating Demand method and use synchronized
	synchronized public void Demand(int n)
	{
		System.out.println("Available Product Before Demand "+availableProduct);
		try {
			if(availableProduct<=n)
			{
				wait();
				availableProduct-=n;
				System.out.println("Available Product After Demand "+availableProduct);
			}
			
		}catch(InterruptedException ie)
		{}
		
	}
	
	//Creating Supply method and use synchronized
	synchronized public void Supply(int n)
	{
		System.out.println("Available Product Before Supply "+availableProduct);
		availableProduct+=n;
		System.out.println("Available Product After Supply "+availableProduct);
		notify();
	}
}
