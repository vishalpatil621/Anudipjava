
public class MainMailId {

	public static void main(String[] args) {
		InvalidMailId im=new InvalidMailId();
		try {
		im.validateEmail();
	    }
		catch(InvalidMailException ie)
		{
			System.out.println(ie);
		}

}
}