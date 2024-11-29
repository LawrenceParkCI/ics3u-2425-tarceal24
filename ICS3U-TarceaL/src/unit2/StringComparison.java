package unit2;

import java.util.Scanner;

/**
 * Description: 
 * Date: 07/11/24
 * @author Luca Tarcea
 */

class StringComparison {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}
		in.close();

		// Run the code. What happens when you type the correct answer? The incorrect
		// answer?
		// Both run the else statement.

		/*
		 * Strings are objects, not primitives and as such are a reference* data type.
		 * These variables hold an address to the value. (Scanner is also a reference
		 * data type)
		 * 
		 * int, double, char, etc. are all *primitive* data types. These variables hold
		 * the actual value.
		 * 
		 * Look at the website: https://www.javatpoint.com/string-comparison-in-java
		 * 
		 * Demonstrate the use of the functions: .compareTo() .equals()
		 * .equalsIgnoreCase()
		 */

		// What values does compareTo() return? How can we
		// interpret the value?
		// compareTo() returns an integer value, it is how far the first different
		// letter is from the compared string based on the Unicode values.

		// what value does equals() and equalsIgnoreCase() return?
		// What is the difference between these two functions?
		// both return a boolean value (true or false) and .equals() only returns true
		// if both strings are identical while .equalsIgnoreCase returns true if the
		// letters are the same while ignoring case conditions.
	}
}