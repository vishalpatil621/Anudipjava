
public class Employee extends Member{
	String specialization;
	String dept;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String specialization, String dept) {
		super();
		this.specialization = specialization;
		this.dept = dept;
	}
	
	void printSalary()
	{
		System.out.println("Information of Employee....");
		System.out.println("Specialization ="+specialization);
		System.out.println("Department ="+dept);
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", dept=" + dept + ", Name=" + Name + ", Age=" + Age
				+ ", PhoneNo=" + PhoneNo + ", Address=" + Address + ", Salary=" + Salary + ", getSpecialization()="
				+ getSpecialization() + ", getDept()=" + getDept() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getPhoneNo()=" + getPhoneNo() + ", getAddress()=" + getAddress() + ", getSalary()="
				+ getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
