package unit2;

import java.util.Scanner;

/**
 * Description: Date: 05/11/24
 * 
 * @author Luca Tarcea
 */

public class IfStatements2 {
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);

		// System.out.println("What is your age?");
		// int userAge = in.nextInt();
		/*
		 * if (userAge > 18) { //If they're over 18, they are titled an adult String
		 * title = "Adult"; } else { //if they're not over 18, I don't want a title
		 * System.out.println("Sorry, not quite yet."); }
		 * 
		 * System.out.println(title);
		 */
		// Looking at the logic above, why do you think the
		// program won't work?
		// Because title is not assigned or declared if the
		// user is not an adult, so the println would not
		// be able to run.

		// Copy the code below, and try to find a solution.
		// Comment the code above to avoid compilation errors.
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();

		if (userAge > 18) { // If they're over 18, they are titled an adult
			String title = "Adult";
			System.out.println(title);
		} else { // if they're not over 18, I don't want a title
			System.out.println("Sorry, not quite yet.");
		}
		in.close();
	}
}