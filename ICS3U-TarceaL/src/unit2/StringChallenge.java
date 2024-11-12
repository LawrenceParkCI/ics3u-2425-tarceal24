package unit2;

import java.util.Scanner;

/**
 * Description: Compares strings to hello world 
 * Date: 12/11/24
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
		System.out.println("Type in \"Hello World\" in any way and <Enter>");
		String helloWorld = sc.nextLine();
		System.out.println("You typed " + helloWorld + ".");
		if (!helloWorld.equals("hello world")) { // testing to see what print lines to run
			System.out.println("You did not type \"hello world\".");
			System.out.println("You were " + Math.abs(helloWorld.compareTo("hello world")) + " characters away.");
			// casts int to string (implicit) and sees how far the user was from the goal
		}

		if (helloWorld.matches("[0-9]")) { // converts string to int (explicit) if it contains a number
			int num = Integer.parseInt(helloWorld);
			System.out.println(num + " is a number. Try again");
		} else if (helloWorld.equalsIgnoreCase("hello world"))
			System.out.println("Good job!"); // testing for user success or failure
		else if (helloWorld.compareToIgnoreCase("hello world") == 0)
			System.out.println("Good job!"); // testing for user success or failure
		else
			System.out.println("You failed. Try again.");

		sc.close();
	}
}
