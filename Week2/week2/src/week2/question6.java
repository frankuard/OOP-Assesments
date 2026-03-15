package week2;
import java.util.Scanner;
public class question6 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entehr the number:");
		int Number = scanner.nextInt();
		
		if (Number%2 == 0) {
			System.out.println("It is even number");
		}
		
		else if(Number%2 != 0) {
			System.out.println("It is odd number");
		}
		
	scanner.close();
	}
	
}
