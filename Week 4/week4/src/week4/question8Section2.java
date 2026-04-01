package week4;

import java.util.Scanner;

public class question8Section2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		String name = "";
		String number = "";
		String dob = "";
		String password = "";
		
		
		while (true) {
			System.out.println("Please enter 1 for Sign up.");
			System.out.println("Please enter 2 to Quit.");
			int choice = scanner.nextInt();
			
			if (choice==1) {
				
				
				scanner.nextLine();
				
				while (true) {
					
					// NAME
				System.out.println("Please enter your full name:");
				 name = scanner.nextLine();
				int len = name.length();
				
				if (len<4) {
					System.out.println("The name must be greater than 4");
					continue;
				}
				
				break;
				
				
				}
				
				while (true) {
					
					// PHONE NUMBER
					
				System.out.println("Please enter your phone number:");
				number = scanner.nextLine();
				
				int len2= number.length();
				
				if (len2!=10 || !number.startsWith("0")) {
					System.out.println("The total digit should be 10 and start with 0");
					continue;
				}
				break;
				}
				
				while (true) {
					
					// AGE
				
				System.out.println("Please enter your date of birth:");
				dob = scanner.nextLine();
				
				int len3 = dob.length();
				
				if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
					System.out.println("Invalid DOB Format");
					continue ;
				}
				int year = Integer.parseInt(dob.substring(6));
				int age = 2026 - year;
				
				if (age < 21) {
					
				System.out.println("You must be at least 21 years old");
				continue;
				}
				break;
				
				}
				while (true) {
				System.out.println("Please enter your password:");
				password = scanner.nextLine();
				
				if (!password.matches("[A-Za-z]+[@&][0-9]+")) {
					System.out.println("Password must start with letters, contain @ or &, and end with numbers");
					continue;
				
				}
				
				System.out.println("Please confirm your password");
				String confirmPass = scanner.nextLine();
				
				
				if (!password.equals(confirmPass)) {
					System.out.println("Password do not match");
					continue;
				}
				
				break;
				
				}
				
				// SUCCESS
				
				userSignUp user = new userSignUp(name,number,dob, password);
				System.out.println("You have successfully signed up.");
			
			}
			else if (choice==2) {
				System.out.println("Thank you for using the Application.");
				break;
			}
		}
		
		}
		
	}
class userSignUp{
	
	String names;
	String numbers;
	String dob;
	String password;
	
public userSignUp(String names,String numbers,String dob,String password){
		this.names = names;
		this.numbers = numbers;
		this.dob = dob;
		this.password = password;
		
		System.out.println("User Registered!");
		
		}
}

