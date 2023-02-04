package oop;

public class bankAccountApp {

	public static void main(String[] args) {
		// create a new bank account instantiate an object
		bankAccount acct1 = new bankAccount();
		acct1.accountNumber = "23477655";
		
		bankAccount acct2 = new bankAccount("Checking Account");
		acct2.accountNumber = "23477655";
		
		bankAccount acct3 = new bankAccount("Savings Account, 5000");
		acct3.accountNumber = "23477655";
		
		System.out.println(acct1.routingNumber);
		System.out.println(acct2.routingNumber);
		System.out.println(acct3.routingNumber);
				
	}

}
