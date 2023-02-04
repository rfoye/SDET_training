package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] Cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(Cities[0]);
		System.out.println(Cities[1]);
		System.out.println(Cities[2]);
		System.out.println(Cities[3]);
		
		//Declare the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		//System.out.println (states[0]);
		int i = 0;
		do {
		System.out.println ("STATE: " + states[i]);
		i=i+1;
		}while (i < 5);
		
		//Declare array
		String[] countries;
		
		//Define the array
		countries = new String[3]; //3 elements
		countries[0] = "USA";      // index starts at 0, so goes to 2
		countries[1] = "Canada";
		countries[2] = "Mexico";
		System.out.println(countries[2]);
		
	}

}
