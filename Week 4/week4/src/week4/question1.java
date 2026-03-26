package week4;

public class question1 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Labrador","Haiti", 3);
		
	}
}

class Animal{
	
	public String name;
	public int age;
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		
		return age;
	}

	
}

class Dog extends Animal{
	
	private String breed;
	
	public String getBreed() {
		return breed;
	}
	
	public Dog(String breed, String name, int age) {
		this.breed = breed;
		this.age = age;
		this.name = name;
		
		System.out.println("Breed:"+ breed);
		System.out.println("Age:"+ age);
		System.out.println("Name:"+ name);
	}
	
}