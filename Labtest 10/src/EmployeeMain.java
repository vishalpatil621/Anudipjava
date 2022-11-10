import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> emp=new ArrayList<>();
		
		Employee e1=new Employee("Roshan",30,"IT",30000);
		Employee e2=new Employee("Aniket",40,"CS",50000);
		Employee e3=new Employee("Rahul",25,"IT",35000);
		Employee e4=new Employee("Sagar",35,"IT",40000);
		Employee e5=new Employee("Prathmesh",32,"CS",10000);
		Employee e6=new Employee("Ganesh",28,"CS",60000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		

	        // Using lambda Expression
	        Collections.sort(emp, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
	        System.out.println("Sorting Name = " + emp);
	        
	        // Employees whose Salaries are above 10000
	        System.out.println(emp.stream().filter((p1)->p1.getSalary()> 10000).collect(Collectors.toList()));
			
	        //The total number of employees having salary  greater than 10000
	        List<Employee> emp2=(emp.stream().filter((p1)->p1.getSalary()> 10000).collect(Collectors.toList()));
	        System.out.println("Count of Employees  : "+emp2.stream().count());
	        
	        //Employee Name and Department whose Salary is Maximum
	        System.out.println("Employee Name and Department whose Salary is Maximum");
	        System.out.println(emp.stream().max((p1,p2)->p1.getSalary()>p2.getSalary()?1:-1).map(e->e.getName()));
	    

	    }

	}


