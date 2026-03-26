package week4;

public class question5 {

	public static void main(String[] args) {
		
		
	}
}

class Parent{
	
	private String variable1;
	public String variable2;
	public String variable3;
}

class Child extends Parent{
	
	public Child(String variable1, String variable2, String variable3) {
		this.variable1 = variable1; // THIS CANNOT BE ACCESSED
		this.variable2 = variable2;
		this.variable3 = variable3;
	}
}