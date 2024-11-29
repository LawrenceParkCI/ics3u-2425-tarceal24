package unit2;

import java.util.Scanner;

/**
 * Description: Interactive Quiz
 * Date: 14/11/24
 * @author Luca Tarcea
 */

public class IfChallenge3 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// This is for the portfolio
		/*
		 * Write an interactive quiz. It should ask the user three multiple-choice or
		 * true/false questions about something. It must keep track of how many they get
		 * wrong, and print out a "score" at the end.
		 */

		// assigning global variables
		Scanner sc = new Scanner(System.in);
		String choice;
		int score = 0;
		boolean end = false;

		// checks user input for quiz choice
		System.out.println("Are you ready for a quiz? \n(Y) or (N)");
		choice = sc.next();
		if (choice.equalsIgnoreCase("N")) // user says no
			System.out.println("Okay. See you next time.");
		else if (choice.equalsIgnoreCase("Y")) { // user says yes
			System.out.println("Choose a quiz from these options:");
			System.out.println("Chemistry \nGeography \nCanadaian History");
			choice = sc.next();
		} else // no valid option chosen
			System.out.println("That is not an option. Please try again.");

		// geography quiz
		if (choice.equalsIgnoreCase("Geography")) {
			System.out.println("\nHow many provinces are in Canada, including territories?\nA) 7\nB) 10\nC) 8\nD) 9");
			choice = sc.next();
			// checks user input for answer
			if (choice.equalsIgnoreCase("B")) { // correct
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong."); // incorrect
			System.out.println("\nHow many oceans border Canada?\nA) 1\nB) 2\nC) 3\nD) 4");
			choice = sc.next();
			if (choice.equalsIgnoreCase("C")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			System.out
			.println("\nWhat is the population of Canada to the nearest million?\nA) 36\nB) 39\nC) 38\nD) 40");
			choice = sc.next();
			if (choice.equalsIgnoreCase("D")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			end = true; // checks if quiz is ended
		}

		// chemistry quiz
		else if (choice.equalsIgnoreCase("Chemistry")) {
			System.out.println("\nHow many valence electrons does an Oxygen atom have?\nA) 5\nB) 6\nC) 7\nD) 8");
			choice = sc.next();
			if (choice.equalsIgnoreCase("B")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			System.out.println("\nHow many valence electrons does an Oxygen anion contain?\nA) 5\nB) 6\nC) 7\nD) 8");
			choice = sc.next();
			if (choice.equalsIgnoreCase("D")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			System.out.println(
					"\nHow many particles are in one mole?\nA) 6.02 x 10^23\nB) 6.01 x 10^23\nC) 6.01 x 10^22\nD) 6.03 x 10^22");
			choice = sc.next();
			if (choice.equalsIgnoreCase("A")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			end = true;
		}

		// canadian history quiz
		else if (choice.equalsIgnoreCase("Canadian History")) {
			System.out.println("\nIn what year did Canada become a country?\nA) 1866\nB) 1867\nC) 1868\nD) 1865");
			choice = sc.next();
			if (choice.equalsIgnoreCase("B")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			System.out.println(
					"\nOn what day did Canada become a country?\nA) July 4\nB) July 1\nC) July 14\nD) July 10");
			choice = sc.next();
			if (choice.equalsIgnoreCase("B")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			System.out.println("\nIn what year did the Act of Union take effect?\nA) 1817\nB) 1823\nC) 1840\nD) 1815");
			choice = sc.next();
			if (choice.equalsIgnoreCase("C")) {
				System.out.println("Good job!");
				score++;
			} else
				System.out.println("Wrong.");
			end = true;
		} else // no valid option chosen
			System.out.println("That is not an option. Please try again.");

		// end print statement of score
		if (end == true && score == 3) // perfect score
			System.out.println("You got a perfect score of " + score + "/3 on this quiz. Great job!");
		else if (end == true) // less than perfect score
			System.out.println("You got a " + score + "/3 on this quiz. Better luck next time");
		sc.close();
	}
}