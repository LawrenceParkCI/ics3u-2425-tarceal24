package unit2;

import java.util.Scanner;

/**
 * Description: Checks day of the week
 * Date: 11/11/24
 * @author Luca Tarcea
 */

public class Switch1 {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		System.out.println("What number day is it?");
//		int day = in.nextInt();
//
//		switch(day) {
//		case 1:
//			System.out.println("Sunday");
//			break;
//		case 2:
//			System.out.println("Monday");
//			break;
//		case 3:
//			System.out.println("Tuesday");
//			break;
//		case 4:
//			System.out.println("Wednesday");
//			break;
//		case 5:
//			System.out.println("Thursday");
//			break;
//		case 6:
//			System.out.println("Friday");
//			break;
//		case 7:
//			System.out.println("Saturday");
//			break;
//		default:
//			System.out.println("We don't have that day yet");
//			break;
//		}

		// Run the program. Type in a number between 1-7, and then a number bigger than
		// that. What is the result?
		// The corresponding case.
		// What do you think default means?
		// The default outcome if the input doesn't match with any cases; similar to an
		// else statement.
		// What do you think break means? What happens when you remove a break?
		// To stop the program from running any other cases in the switch statement once
		// a case is found true. When a break is removed, the next case is run
		// automatically.

		// Create another program, this time asking what day it is (String), and
		// printing out how many days until the weekend

		System.out.println("What day of the week is it?");
		String weekday = in.nextLine();

		switch (weekday) {
		case ("Sunday"):
			System.out.println("It is the weekend!");
			break;
		case ("Monday"):
			System.out.println("There are 5 days until the weekend.");
			break;
		case ("Tuesday"):
			System.out.println("There are 4 days until the weekend.");
			break;
		case ("Wednesday"):
			System.out.println("There are 3 days until the weekend.");
			break;
		case ("Thursday"):
			System.out.println("There are 2 days until the weekend.");
			break;
		case ("Friday"):
			System.out.println("There is 1 day until the weekend.");
			break;
		case ("Saturday"):
			System.out.println("It is the weekend!");
			break;
		default:
			System.out.println("That is not a day, please try again.");
		}

		in.close();
	}
}