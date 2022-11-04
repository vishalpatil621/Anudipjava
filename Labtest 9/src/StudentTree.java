import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class StudentTree {

	public static void main(String[] args) {
		
		//Creating Tree Set Object
        TreeSet<Student> tset = new TreeSet<>();
	 
        //Used Previous ArrayList
        StudentList.fillArrayList();
		tset.addAll(StudentList.list1);
		tset.addAll(StudentList.list2);
		
		    // Printing the elements inside the TreeSet object
		    System.out.println("Number of element in the set : "+tset.size());
	        
	        // Print the first element	        
	        System.out.println("First Value in set :" + tset.pollfirst());
	 
	        // Print the last element in	       
	        System.out.println("Last Value in set :" + tset.polllast());
	 
	}

}
