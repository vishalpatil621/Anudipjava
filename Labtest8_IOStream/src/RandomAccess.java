import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccess {

	public static void main(String[] args) throws IOException{
		//creating a file
		File file=new File("G:\\MyName.txt");
		
		//Using try catch block
		try {
			//creating a RandonAccessfile
			RandomAccessFile fr=new RandomAccessFile(file,"r");
			fr.seek(file.length()-10);
			
			for (int i = 0; i < 10; i++) {
				System.out.print((char)fr.read());
			}
			fr.close();
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		

	}

}
