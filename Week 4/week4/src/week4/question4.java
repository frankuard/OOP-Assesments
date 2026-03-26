package week4;

public class question4 {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Biratnagar 1", "Lecturer");
	}
}

class Person{
	protected String address;
	
}

class Employee extends Person{
	String department;
	
public Employee(String address, String department) {
	this.address = address;
	this.department  =department;
	
	System.out.println("Address:"+ address);
	System.out.println("Department:"+ department);
	
	
}
}