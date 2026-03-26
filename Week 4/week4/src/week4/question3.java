package week4;

public class question3 {

	public static void main(String[] args) {
		
	
		Dog2 dog2 = new Dog2("Haiti");
	}
}

class Animal2{
	
	public String name;
	public int age;
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public Animal2(String name) {
		this.name = name;
		
		System.out.println(name);
	}
}

class Dog2 extends Animal2{
	
	public Dog2(String name) {
		super(name);
		this.name = name;
	}
}
	
