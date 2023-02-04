package oop;

public class bankAccount {
		// define variables
		String accountNumber;
		
		// static belongs to the object CLASS
		static String routingNumber = "456734";
		String name;
		String ssn;
		String accountType;
		
		//constructor definitions; unique methods
		// used to define, set up, initialize properties of an object
		//implicitly called upon instantiation
		//same name as the class itself
		//Constructors have no return type
		bankAccount(){
			System.out.println("New account created.");
		}
		
		//Overloading: call same method with different arguments
		bankAccount(String accountType){
			System.out.println("New Account: " + accountType);
		}

		bankAccount(String accountType, double initDeposit){
			System.out.println("New Account: " + accountType);
			System.out.println("initial deposit of: $" + initDeposit);
		}

		
		//define methods
		void deposit() {		
			
		};
		void withdraw() {
			
		}
		
		void checkBalance() {
			
		}
		
		void getStatus() {
			
		}
}
		