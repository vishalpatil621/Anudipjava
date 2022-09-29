
public class Member {
	String Name;
	int Age;
	String PhoneNo;
	String Address;
	int Salary;
	
	public Member()
	{
		super();
	}
	
   public Member(String name, int age, String phoneNo, String address, int salary)
   {
		super();
		Name = name;
		Age = age;
		PhoneNo = phoneNo;
		Address = address;
		Salary = salary;
	}
    
   void printSalary()
   {
	   System.out.println("Name ="+Name);
	   System.out.println("Age ="+Age);
	   System.out.println("Phone Number ="+PhoneNo);
	   System.out.println("Address ="+Address);
	   System.out.println("Salary ="+Salary);
   }

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public String getPhoneNo() {
	return PhoneNo;
}

public void setPhoneNo(String phoneNo) {
	PhoneNo = phoneNo;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}
   
}
