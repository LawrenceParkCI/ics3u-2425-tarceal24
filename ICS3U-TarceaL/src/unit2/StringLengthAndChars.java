package unit2;

import java.util.Scanner;

/**
 * Description: Prints every character in a name
 * Date: 26/11/24
 * @author Luca Tarcea
 */

public class StringLengthAndChars {

	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Goal: Using string methods with a for loop .length() .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		// write comments for the following code - what does it print out, and why?
		System.out.println(name.length()); // 8, that is the length of the string
		System.out.println(name.charAt(1)); // s, that is the character at that index
		System.out.println(name.charAt(2)); // ., that is the character at that index
		System.out.println(name.charAt(3)); // space, that is the character at that index

		// .length() gets the length
		// .charAt(position) gets the character
		// counting starts at 0

		/**
		 * Ask for user input for name. Print out each individual letter of the name on
		 * separate lines, using a for loop
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Type your name and <Enter>");
		name = sc.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		sc.close();

	}
}