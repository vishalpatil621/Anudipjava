import java.util.HashSet;

public class StudentHashset {

	public static void main(String[] args) {
		
		//Creating Hash Set Object
		HashSet<Student> hset=new HashSet<>();
		
		Student s1=new Student(1, "Vishal", "7739845220");
		Student s2=new Student(2,"Sagar","8458735783");
		Student s3=new Student(3,"Aniket","830501654");
		Student s4=new Student(4,"Pratik","78903402277");
		Student s5=new Student(5,"Vaibhav","82735235478");
		Student s6=new Student(6,"Tushar","9847082360");
		
		//Using add() method
		hset.add(s1);
		hset.add(s3);
		hset.add(s6);
		hset.add(s5);
		hset.add(s4);
		hset.add(s2);
		
		//Using for loop
		for (Student s : hset) 
		{
			if (s.getSid()>3) 
			{
				System.out.println(s);
			}
		} 

	}

}
