import java.util.Scanner;

public class InvalidMailId {
	public static void validateEmail() throws InvalidMailException {
		String s1;
		// Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email address ");
		s1=sc.nextLine();
		if((s1.endsWith("@")||s1.endsWith("."))||s1.contains(" "))
			throw new InvalidMailException("Enter Valid Email");
		if((s1.contains("@")&&s1.contains(".")&& s1.indexOf("@")<s1.indexOf(".")))
	    System.out.println("Valide Email...");
		else {
			System.out.println("Enter Invalid Email...");
			throw new InvalidMailException("") ;
		}
}	
}
