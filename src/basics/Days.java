package basics;

public class Days {
	public static void main(String[] args) {
	//execute different block of code based on condition
		String dayOfWeek = "Wednesday";
		String tday = "Today is ";
		
		switch (dayOfWeek) {
		case "Monday"	: System.out.println(tday + "Monday");
		break;
		case "Tuesday" 	: System.out.println(tday+"Tuesday");
		break;
		case "Wednesday" : System.out.println(tday + dayOfWeek);
		break;
		case "Thursday"  : System.out.println(tday + dayOfWeek);
		break;
		case "Friday" 	: System.out.println(tday + dayOfWeek);
		break;
		case "Saturday" : System.out.println("Tomorrow is "+ "Sunday");
		break;
		case "Sunday"	: System.out.println(tday + dayOfWeek);
		break;
		}
	}
}
