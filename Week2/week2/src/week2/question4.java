package week2;
import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Largest = Integer.MIN_VALUE;
		int Smallest = Integer.MAX_VALUE;
		
		
		System.out.println("How many user you wanna enter?");
		int User = scanner.nextInt();
		
		for (int i=1;i<=User;i++) {
			
			System.out.println("Enter the age of the user "+i+":");
			int UserAge = scanner.nextInt();
			
			if (UserAge> Largest) {
				Largest = UserAge;
			}
			
			if (UserAge<Smallest) {
				Smallest = UserAge;
			}
		}
		
		System.out.println("Largest Age:"+ Largest);
		System.out.println("Smallest Age:"+ Smallest);
		
		
		scanner.close();
	}
}
