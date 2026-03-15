package week2;
import java.util.Scanner;

public class question9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		System.out.println("Enter the amount of numbers you want to sum:");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n;i++) {
			if (n%i==0) {
			total += i;
			}
		}
	System.out.println(total);
	}
}
