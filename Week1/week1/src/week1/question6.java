package week1;

import java.util.Scanner;
public class question6 {
	public static void main(String[] args){
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Enter the length of the square:");
	double num= scanner.nextDouble();
	
	double square= Math.pow(num, 2);
	
	System.out.println("The area of the Square is:"+ square);
	
	scanner.close();
}

}