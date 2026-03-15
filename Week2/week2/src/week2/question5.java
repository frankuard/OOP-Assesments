package week2;
import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you have a medical cause?('y' or 'n')");
		String Medical = scanner.nextLine();
		
		String LowercaseMedical = Medical.toLowerCase();
		
		if (LowercaseMedical.equals("y")) {
			System.out.println("You are not allowed to sit in the exam");
		}
		
		if (LowercaseMedical.equals("n")) {
			System.out.println("You are allowed to sit in the exam");
		}
	scanner.close();
	}
}
