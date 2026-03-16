package week2;
import java.util.Scanner;

public class question11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result= 1;
		
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		
		for (int i=1; i<=num;i++) {
			
		result *= i;
		
		}
	System.out.println("Result:"+ result);
	
	scanner.close();
	
	}
}
