package week1;

import java.util.Scanner;
public class question10{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		double num1= scanner.nextDouble();
		
		System.out.println("Enter the Second Number:");
		double num2= scanner.nextDouble();
		
		double add= num1+num2;
		double sub= num1-num2;
		double multiply= num1*num2;
		double divide= num1/num2;
		
		System.out.println("Addition:"+add);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+multiply);
		System.out.println("Division:"+divide);
		scanner.close();
		
	}
	
}
