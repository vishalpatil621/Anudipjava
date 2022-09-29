
public class MainMember {

	public static void main(String[] args) {
		

		Employee e=new Employee();
		e.setName("sagar");
		e.setAge(30);
		e.setPhoneNo("7535899378");
		e.setAddress("pqr");
		e.setSalary(30000);
		e.setSpecialization("confidence");
		e.setDept("CS");
		
		System.out.println("Information of Employee....");
		System.out.println("Name ="+e.getName());
		System.out.println("Age ="+e.getAge());
		System.out.println("Phone number ="+e.getPhoneNo());
		System.out.println("Address ="+e.getAddress());
		System.out.println("Salary ="+e.getSalary());
		System.out.println("Specialization ="+e.getSpecialization());
		System.out.println("Department ="+e.getDept());
		
		Maneger mn=new Maneger();
		mn.setName("Amar");
		mn.setAge(35);
		mn.setPhoneNo("7837800078");
		mn.setAddress("sts");
		mn.setSalary(50000);
		mn.setSpecialization("Problem Solver");
		mn.setDept("IT");
		
		System.out.println("Information of Maneger....");
		System.out.println("Name ="+mn.getName());
		System.out.println("Age ="+mn.getAge());
		System.out.println("Phone number ="+mn.getPhoneNo());
		System.out.println("Address ="+mn.getAddress());
		System.out.println("Salary ="+mn.getSalary());
		System.out.println("Specialization ="+mn.getSpecialization());
		System.out.println("Department ="+mn.getDept());
	}

}
