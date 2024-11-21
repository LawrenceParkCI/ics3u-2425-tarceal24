package unit2;

/**
Description: Do while loops
Date: 21/11/24
@author Luca Tarcea
*/

import java.util.Scanner;

public class DoWhile {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * A loop is another control structure that allows for repetition. It does not
		 * make a decision on which branch to go on, like the conditional. It makes a
		 * decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		// Run the code. Explain the code in your own words
		// Scan user input for Mr. Lee, if not, keep scanning, if yes, end

		// What code is repeated?
		// name scanning (lines 26, 27)
		// When does it decide whether to repeat or not?
		// after the iteration is completed
		// What is the condition for repeating?
		// user input is not Mr. Lee

		/*
		 * Note:Pay attention to the brackets, and the semicolon
		 */

		/*
		 * When constructing a loop, there are many strategies. I like to break down the
		 * problems this way: 1. What commands am I going to repeat? 2. How many
		 * times/until when will I repeat the code?
		 */

		// Create a do-while loop that asks for a word, and
		// prints it out 20 times.
		int i = 0;
		System.out.println("Type a word and <Enter>");
		String userInput = in.next();
		do {
			System.out.println(userInput);
			i++;
		} while (i < 20);
		in.close();
	}
}