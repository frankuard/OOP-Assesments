package week7;


public class mainBank {

	public static void main(String[] args) {
		
		Account acc1 = new Account("Roshan", "Karki",1,10000);
		Account acc2 = new Account("Suraj", "Poddar",1,20000);
		
		System.out.println("Before Transaction");
		acc1.displayCustomer();
		acc1.displayAccount();
		acc2.displayCustomer();
		acc2.displayAccount();
		
		Transaction t = new Transaction();
		t.transfer(acc1, acc2, 5000);
		
		System.out.println("After Transaction");
		acc1.displayCustomer();
		acc1.displayAccount();
		acc2.displayCustomer();
		acc2.displayAccount();
		
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
		System.out.print(firstName);
		System.out.println(" "+lastName);
		
	}
}


class Account extends Customer{
	
	private int accountNumber;
	private float accountBalance;
	
	
	public Account(String firstName, String lastName, int accountNumber, float accountBalance) {
		
		super(firstName, lastName);
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
	public void transfer(Account fromAccount, Account toAccount, int amount) {
		
		if (fromAccount.getBalance() >= amount) {
			fromAccount.withdraw(amount);
			toAccount.deposit(amount);
			System.out.println("Transfer Successfull");
		}
		else {
			System.out.println("Transfer failed! Insufficient Balance");
			
		}
		
	}
	
	}
	
