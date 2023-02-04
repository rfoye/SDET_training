package basics;

public class Quiz1 {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println (sum(6));


	}
	public static int sum(int n) {
		int total=0;
		int i;
		i=n;
		while (i>0) {
			total = total + i;
			i--;
		
		}
		return total;
	}
}
