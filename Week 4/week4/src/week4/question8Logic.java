package week4;

import java.util.Scanner;

public class question8Logic {

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
				System.out.println("Please enter your full name:");
				 name = scanner.nextLine();
				int len = name.length();
				
				if (len<4) {
					System.out.println("The name musrt be greater than 4");
					continue;
				}
				
				break;
				
				
				}
				
				while (true) {
				System.out.println("Please enter your phone number:");
				number = scanner.nextLine();
				
				int len2= number.length();
				
				if (len2!=10) {
					System.out.println("The total digit should be 10");
					continue;
				}
				break;
				}
				
				while (true) {
				System.out.println("Please enter your date of birth:");
				dob = scanner.nextLine();
				
				int len3 = dob.length();
				
				}
				System.out.println("Please enter your password:");
				password = scanner.nextLine();
				
				userSignUp user = new userSignUp(name,number,dob, password);
				
				
			
			}
			if (choice==2) {
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

