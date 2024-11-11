package unit2;

import java.util.Scanner;

/**
 * Description: 
 * Date: 11/11/24
 * @author Luca Tarcea
 */

public class StringChallenge {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// This is for the portfolio
		/*
		 * Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(),
		 * .compareTo(). You should be using if statements for this program.
		 * 
		 * Also, include an example of explicit and implicit casting.
		 * 
		 * Comment to explain: -when you use the different String functions -when you
		 * are casting and how the value is changed
		 */
		System.out.println("Type in a sentence and <Enter>");
		String str = sc.next();
		System.out.println(str);
		System.out.println(str.equals(""));
		System.out.println(str.equalsIgnoreCase(""));
		System.out.println(str.compareTo(""));

		sc.close();
	}
}