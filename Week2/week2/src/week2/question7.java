package week2;
import java.util.Scanner;

public class question7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int Number = scanner.nextInt();
		
		if(Number%2==0 && Number%4 == 0) {
			System.out.println("It is a even number which is divisible by 4");
		}
		if(Number%2==0 && Number%4 != 0) {
			System.out.println("It is a even number which is not divisible by 4");
		}
		if(Number%2!=0 && Number%7 == 0) {
			System.out.println("It is a odd number which is divisible by 7");
		}
		if(Number%2!=0 && Number%7 != 0) {
			System.out.println("It is a odd number which is not divisible by 7");
		}
		scanner.close();
	}
}
