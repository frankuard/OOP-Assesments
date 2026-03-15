package week2;
import java.util.Scanner;

public class question8 {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter the marks for Physics:");
		 double Physics = scanner.nextDouble();
		 
		 System.out.println("Enter the marks for Chemistry:");
		 double Chemistry = scanner.nextDouble();
		 
		 System.out.println("Enter the marks for Biology:");
		 double Biology = scanner.nextDouble();
		 
		 System.out.println("Enter the marks for Mathematics:");
		 double Mathematics = scanner.nextDouble();
		 
		 System.out.println("Enter the marks for Computer:");
		 double Computer = scanner.nextDouble();
		 
		 double TotalMarks= Physics + Chemistry + Biology + Mathematics + Computer;
		 
		 double Percentage = (TotalMarks/100)*100;
		 
		 if (Percentage>=90) {
			 System.out.println("Your grade is A");
		 }
		 
		 else if (Percentage>=80) {
			 System.out.println("Your grade is B");
		 }
		 
		 else if (Percentage>=70) {
			 System.out.println("Your grade is C");
		 }
		 
		 else if (Percentage>=60) {
			 System.out.println("Your grade is D");
		 }
		 
		 else if (Percentage>=50) {
			 System.out.println("Your grade is E");
		 }
		 
		 else if (Percentage>=40) {
			 System.out.println("Your grade is F");
		 }
		 
		 scanner.close();
	 }
	
}
