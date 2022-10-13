
public class MainVowels {

	public static void main(String[] args) {
		Vowels v=new Vowels();
		try {
			v.countVowels();
		}catch(CheckedException ce){
			System.out.println("Found X in the string "+ce);
			
		}
	}

}
