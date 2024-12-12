package unit2;

/**
 * Description: Use variables in for loops
 * Date: 25/11/24
 * @author Luca Tarcea
 */

public class For2 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Recall - create a for loop printing 1 to 10:
//	  for (int i = 1; i <= 10; i++)

		// though we are repeating a certain number of times, we can use variables in
		// our for loops as well

		int times = 20;

		for (int i = 15; i < times; i++) {
			System.out.println(i);
		}

		// In addition, the counter doesn't necessarily have to be an integer
		double increment = 0.1;
		for (double i = 0; i < 2; i += increment) {
			System.out.println(i);
		}

		// create a variable to store the starting number, and use it in a for loop. Be
		// able to use a double value:

		// Look at the following code. Explain what is happening?
		// i is added to sum every iteration i.e. 1 + 2 + 3 + 4 etc. as long as i is
		// below 10. Then print sum.

		int sum = 0;

		for (int i = 1; i < 10; i++) {
			sum += i;
		}

		System.out.println(sum);

	}
}