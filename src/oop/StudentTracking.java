package oop;

public class StudentTracking {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Mark","123-45-6789");
		Student stud2 = new Student("Debbie", "111223456");
		Student stud3 = new Student("Bill", "234561234");
		
		stud1.enroll("English 101");
		stud1.enroll("Math 234");
		stud1.enroll("History 150");
		
		stud1.checkBalance();
		stud1.pay(600);
		stud1.showCourses();
		stud1.checkBalance();
		stud1.toString();
		System.out.println(stud1.toString());
	}

}

class Student {	
	private static int iD = 1000;
	private String name;
	private String ssn;
	private String email;
	private double balance = 0;
	private String studentID;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;    
	
	//constructor
	public Student(String name, String ssn) {
		System.out.println("New student created");
		this.name = name;
		this.ssn = ssn;
		iD++;
		System.out.println("iD is: "+iD);
		System.out.println("Name is: "+this.name);
		System.out.println("SSN is: "+this.ssn);
		setEmail()	;
		setStudentID();
	}

	//setters
	private void setEmail(){
		email = name.toLowerCase() + "@testlab.com";
		System.out.println(email);
	}
	public String getEmail() {
		return email;
	}
	private void setStudentID() {
		int random = (int) (Math.random()*10000 );
		studentID =  String.valueOf(iD) + random + ssn.substring(7);
		System.out.println("student ID: " + studentID );
	}
	
	//Methods (functions)
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course; 
		balance = balance + costOfCourse;
	}
	public void pay(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount; 
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public String toString() {
		//System.out.println("toString");
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "]" ;
	}
	public void showCourses() {
		System.out.println("courses enrolled in: " + courses);
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	// variables
	//phone, city, state
	
}