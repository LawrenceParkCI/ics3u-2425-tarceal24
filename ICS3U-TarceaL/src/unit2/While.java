package unit2;

/**
Description: Practice while loops
Date: 21/11/24
@author Luca Tarcea
*/

import java.util.Scanner;

public class While {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		// Why do you think I coded it this way?
		// no idea, doesn't nextInt do the same thing?
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			// Why do you think the variable is declared here?
			// it is only used in the while loop.
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}

		// Run the code Using the debugger.
		// Explain the code in your own words
		// scan for how many people, then scan for their names.

		// What code is repeated?
		// scanning for names.
		// When does it decide whether to repeat or not?
		// before the first iteration.
		// What is the condition for repeating?
		// number of people greater than 0.

		// What is the difference between a while loop and a do-while loop?
		// do-while runs the first iteration no matter what because it checks for
		// conditions after the loop is run.

		// Create a while loop that asks for a word,
		// and prints it out 20 times.

		System.out.println("Type a word and <Enter>");
		String userInput = in.next();
		int i = 0;
		while (i < 20) {
			System.out.println(userInput);
			i++;
		}

		in.close();
	}
}