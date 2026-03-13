package week2;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of the multiplication table");
		int number= scanner.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			int multiply= number*i;
			
			System.out.println(number+"*"+i+"="+multiply);
		}
		
		scanner.close();
	}
}
