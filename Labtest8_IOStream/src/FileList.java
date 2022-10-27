import java.io.File;

public class FileList {

	public static void main(String[] args) {
		
		//creating a file
		File file=new File("G:\\MyName.txt");
		String[] s=file.list();
		System.out.println("File names present in the folder");
		
		for (String string : s) 
		{
			System.out.println(string);
		}
		
		System.out.println("\nPermission check:");
		File[] f =file.listFiles();
		
		for (File fl : f) 
		{
			System.out.println("File Name : "+fl.getName());
			System.out.println("Writable : "+fl.canWrite());
			System.out.println("Readable : "+fl.canRead());
			System.out.println("Executable : "+fl.canExecute()+"\n");
		}
	}

}
