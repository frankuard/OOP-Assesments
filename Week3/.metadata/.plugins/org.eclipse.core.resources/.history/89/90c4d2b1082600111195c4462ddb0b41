package week3;

public class question5 {
	 public static void main(String[] args) {
		 
		 bankAccount bankacc1= new bankAccount();
			bankacc1.accountNumber = 20034;
			bankacc1.balance= 33454.66;
			bankacc1.accountHolderName = "Roshan";
			bankacc1.accountHolderAddress = "Biratnagar 1";
			bankacc1.printInfo();
			bankacc1.depositMoney(500.50);
			bankacc1.withdrawMoney(300.50);
			
	 }
}

class bankAccount{
	int accountNumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;
	
	void printInfo() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Account Holder's Name: "+accountHolderName);
		System.out.println("Account Holder's Address: "+ accountHolderAddress);
	}
	
	void depositMoney(double n) {
		 balance += n;
		System.out.println("Deposited: "+n);
		System.out.println("New Balance: "+balance);
	}
	
	void withdrawMoney(double n) {
		balance -= n;
		System.out.println("Withdrawn: "+n);
		System.out.println("New Balance: "+balance);
	}
	
}
