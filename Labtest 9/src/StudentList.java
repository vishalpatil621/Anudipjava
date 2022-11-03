import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {
	
    //Creating Object of Array list
	static ArrayList <Student>list1;
	static ArrayList <Student>list2;

	public static void main(String[] args) {
		fillArrayList();
		printArrayList();
		
	}
	
	public static void fillArrayList()
	{
	    list1=new ArrayList<Student>();
	    
	    Student s1=new Student(2,"ABC","76473828");
	    Student s2=new Student(3,"DEF","97438957");
	    Student s3=new Student(1,"GHI","98765345");
  
	    //Using add() method
	    list1.add(s1);
	    list1.add(s2);
	    list1.add(s3);
	    
        list2=new ArrayList<Student>();
	    
	    Student s11=new Student(4,"KLM","47677847");
	    Student s22=new Student(6,"NOP","67545879");
	    Student s33=new Student(5,"STU","87789790");
  
	    //Using add() method
	    list2.add(s11);
	    list2.add(s22);
	    list2.add(s33);
	  	   
	}

	private static void printArrayList() {
		
		//Using Sort Method
		Collections.sort(list1,new SidComparator());
		Collections.sort(list2,new SidComparator());
		Collections.sort(list1,new NameComparator());
		Collections.sort(list2,new NameComparator());
		
		   
		  //Using Iterator
		    Iterator itr1=list1.iterator();
		    Iterator itr2=list2.iterator();
		    
		  System.out.println("Student list 1");
		  
		  //Using ForEach loop
		    for(Student s:list1)
		    {
		    	System.out.println(s);
		    	
		    }
		    
		    System.out.println("Student list 2");
		    
		    for(Student s1:list2)
	    	{
	    		System.out.println(s1);
	    	}

	}

	
}
