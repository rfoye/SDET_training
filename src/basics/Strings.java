package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitles;
		String wordChoice = "Ring";
		
		bookTitles = "The Lord of the Rings";
		if (bookTitles.contains(wordChoice)) {
			System.out.println("The book contains the word Ring.");
			
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
			
		String firstName = "Tim";
		String lastName = "Short";
		String ssn = "123-45-6789";
			
		//Print the initials and last 4 of ssn
		System.out.print(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(ssn.substring(7));
		

		}
	}

}
