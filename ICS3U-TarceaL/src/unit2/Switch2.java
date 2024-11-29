package unit2;

import java.util.Scanner;

/**
 * Description: Checks how many days are in the month 
 * Date: 11/11/24
 * @author Luca Tarcea
 */

public class Switch2 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create a program that asks for a month, and print out how many days there are
		 * in that month. (For "February", just put 28). This will be a part of your
		 * portfolio.
		 * 
		 * Challenge: Ask for the year, and change "February" to 29 if the year is a
		 * leap year (divisible by 4)
		 */

		// Can you create it such that you can remove some breaks?

		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a month and <Enter>");
		String month = sc.next();
		switch (month) {
		case ("January"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		case ("February"):
			System.out.println("Type in a year and <Enter>");
			int year = sc.nextInt();
			boolean leapYear = (year % 4 == 0);
			if (leapYear) {
				System.out.println("There are 29 days in " + month + ".");
			} else {
				System.out.println("There are 28 days in " + month + ".");
			}
			break;
		case ("March"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		case ("April"):
			System.out.println("There are 30 days in " + month + ".");
			break;
		case ("May"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		case ("June"):
			System.out.println("There are 30 days in " + month + ".");
			break;
		case ("July"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		case ("August"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		case ("September"):
			System.out.println("There are 30 days in " + month + ".");
			break;
		case ("October"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		case ("November"):
			System.out.println("There are 30 days in " + month + ".");
			break;
		case ("December"):
			System.out.println("There are 31 days in " + month + ".");
			break;
		default:
			System.out.println("That is not a month, please try again.");
		}

		sc.close();
	}
}