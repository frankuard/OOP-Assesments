package week2;
import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int MinAge = Integer.MAX_VALUE;
		int MinAge = Integer.MIN_VALUE;
		int age;
		
		
		System.out.println("Enter the first person age:");
		double person1 = scanner.nextDouble();
		
		System.out.println("Enter the second person age:");
		double person2 = scanner.nextDouble();
		
		System.out.println("Enter the third person age:");
		double person3 = scanner.nextDouble();
		
		if (person1>person2 && person1>person3) {
			System.out.println("The first person is the oldest");
		}
		
		scanner.close();
	}
}
