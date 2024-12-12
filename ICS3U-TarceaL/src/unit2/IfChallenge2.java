package unit2;

import java.util.Scanner;

/**
 * Description: Least to greatest checker
 * Date: 05/11/24
 * @author Luca Tarcea
 */

public class IfChallenge2 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// This is for the portfolio
		/*
		 * Create a program that asks for three numbers. Tell the user if the numbers
		 * are strictly in order. ie. 2 5 11 or 5 6 7 are strictly in order. ie. 6 5 7
		 * or 5 5 7 are not
		 */

		// Assigning global variables
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		// Scan user input
		System.out.println("Type in a number and <Enter>");
		num1 = sc.nextInt();
		System.out.println("Type in a number and <Enter>");
		num2 = sc.nextInt();
		System.out.println("Type in a number and <Enter>");
		num3 = sc.nextInt();

		// Check for order
		if (num1 < num2 && num2 < num3) { // Least to greatest
			System.out.println("Your numbers are in order from least to greatest.");
		} else { // Any other order
			System.out.println("You should choose better numbers.");
		}
		sc.close();
	}
}