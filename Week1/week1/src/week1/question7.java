package week1;

import java.util.Scanner;
public class question7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the temprature in Celcius:");
		double temp= scanner.nextDouble();
		
		double fahr= (temp*1.8) + 32;
		System.out.println("The temprature in Fahrenheit is:"+ fahr);
	
		scanner.close();
	}
}
