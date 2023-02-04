package basics;

public class weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on the weather(temperature)
		int temperature =25;
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and T-shirt.");			
		}
		else if (temperature > 60) {
			System.out.println("It's a little chilly. Put on a long sleeve shirt and jeans.");			
		}
		else {
			System.out.println("It's cold. Wear a sweater.");
		}
	}
}
