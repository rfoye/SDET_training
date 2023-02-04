package oop;

class person  { 
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}
public class demo {

	public static void main(String[] args) {
		// instantiating the object
		person person1 = new person();
		//define some properties
		person1.name = "Joe";
		person1.email = "joe@madeupemail.com";
		person1.phone = "3213456677";
		
		//abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
	}
		
		/*	
		// person
		//attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "3234567854";
		
		//action, activity, behavior
		//System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating");
		
		//what if we wanted to do for another person
		String name2 = "Sarah";
		String email2 = "Sarah@testemail.com";
		String phone2 = "3234567854";
		
		//action, activity, behavior
		//System.out.println(name2 + " is walking.");
		walking(name2);
		
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together?
		
		
	}
	*/
	//enhance by adding functions to minimize amount of coding
	static void walking(String name){
		System.out.println(name + " is walking.");
	} 
	 
}
