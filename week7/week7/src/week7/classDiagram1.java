package week7;
import java.util.*;

public class classDiagram1 {

	public static void main(String[] args) {
		
		
	}
}

class Customer{
	
	private String firstName;
	private String lastName;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public void displayCustomer() {
		System.out.println(firstName);
		System.out.println(lastName);
		
	}
}


class Account extends Customer{
	
	private int accountNumber;
	private float accountBalance;
	
	
	public Account(String firstName, String lastName, int accountNumber, float accountBalance) {
		
		super(firstName,lastName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		
	}
	
public void getAccount() {
		
		
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Balance: "+ accountBalance);
	}


public void deposit(int amount){
		
		accountBalance += amount;  
		
		System.out.println("The amount "+ amount +" has been deposited");
		System.out.println("The final amount is "+ accountBalance);
		
		
	}
	
public void withdraw(int amount){
		  
		
		if (accountBalance<amount) {
			
			System.out.println("Insufficient Balance!!");
		}
		else {
			
			accountBalance -= amount;
			
			System.out.println("The amount "+ amount +" has been withdrawn");
			System.out.println("The final amount is "+ accountBalance);
		}
		
	}
	
public double getBalance() {
	return accountBalance;
}

public int getAccountNumber() {
	return accountNumber;
}

public void displayAccount() {
	
	getAccount();
	System.out.println("Account Number:"+ accountNumber);
	System.out.println("Account Balance:"+ accountBalance);
	
}

}



class Transaction{
	public void transfer(Account fromAccount, Account toAccount, float accountBalance) {
		
		if (fromAccount.getBalance()>= ) {
			
		}
		
	}
	
	}
	
	
}
