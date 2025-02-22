package unit1;

import java.util.Scanner;

/**
 * Description: Calculates and displays how many days you were alive and how
 * many hours you have slept. Date: 07/10/24
 * 
 * @author Luca Tarcea
 */
public class Alive {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaring variables
		int daysMonth;
		int years, months, days;
		int daysYear;
		int year, month, day;
		int year2, month2, day2;
		int alive;
		int sleep;

		// Scans date of birth and assigns variables
		System.out.println("Type in your birth year and <Enter>");
		year = sc.nextInt();
		System.out.println("Type in your birth month and <Enter>");
		month = sc.nextInt();
		System.out.println("Type in your birth day and <Enter>");
		day = sc.nextInt();
		// Scans current date and assigns variables
		System.out.println("Type in the current year and <Enter>");
		year2 = sc.nextInt();
		System.out.println("Type in the current month and <Enter>");
		month2 = sc.nextInt();
		System.out.println("Type in the current day and <Enter>");
		day2 = sc.nextInt();
		sc.close();

		// Prints information inputted
		System.out.format("\nYour birthday is %02d/%02d/%4d", day, month, year);
		System.out.println();
		System.out.format("\nToday's date is %02d/%02d/%4d", day2, month2, year2);
		System.out.println();

		// Calculates variables
		years = year2 - year;
		months = month2 - month;
		days = day2 - day;
		daysYear = years * 365;
		daysMonth = months * 30;
		alive = daysYear + daysMonth + days;
		sleep = alive * 8;

		// Prints final statements
		System.out.println("\nYou have been alive for " + alive + " days.");
		System.out.println("\nYou have been asleep for " + sleep + " hours.");

	}

}
