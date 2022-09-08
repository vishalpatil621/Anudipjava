
public class SwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		String s="+";
		switch(s)
		{
		case "+":System.out.println("Addition="+(a+b));break;
		case "-":System.out.println("Subtracion="+(a-b));break;
		case "*":System.out.println("Multiplication="+(a*b));break;
		case "/":System.out.println("Division="+(a/b));break;
		case "%":System.out.println("Modulus="+(a%b));break;
		default:System.out.println("Invalid");break;
		}

	}

}
