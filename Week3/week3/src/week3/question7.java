package week3;

public class question7 {
	public static void main(String[] args) {
		
		newChild user1 = new newChild(12002,20000.00,"Roshan","Biratnagar 1");
		newChild user2 = new newChild(15689,15000.00,"Suraj","Biratnagar 7");
	
		user1.printInfo();
		user2.printInfo();
	}
}

class newChild extends BankAccount{
	
	public newChild(int accountNumber,
			double balance,
			String accountHolderName,
			String accountHolderAddress) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
	}


	
	
	//THIS IS FOR THE QUESTION NO 8
	
	
	void printInfo() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Account Holder's Name: "+accountHolderName);
		System.out.println("Account Holder's Address: "+ accountHolderAddress);
	}

}
