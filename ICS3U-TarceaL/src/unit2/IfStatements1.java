package unit2;

/**
 * Description: If else practice
 * Date: 05/11/24
 * @author Luca Tarcea
 */

public class IfStatements1 {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}

		// What prints out? Why?
		// Nothing, because 10 is not greater than 30, the if statement does not run.

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		// What prints out? Why?
		// XQCL, because 10 is not greater than 30, the else statement runs.

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0) {
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		// What prints out? Why?
		// sykSHY, because 10 is not greater than 30, the else if statement checks and
		// is true, so it runs and the last else statement doesn't run.

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0) {
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0) {
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		// What prints out? Why?
		/*
		 * 1 KEKW OMEGALUL 2 KEKW OMEGALUL sykSHY for the first part, 10 is less than
		 * 30, and nothing else runs or is checked because they are else if and else
		 * statements, which only check if the first if statement is false .
		 * 
		 * for the second part, 10 is less than 30, but the other statements are now if
		 * statements so they are checked regardless of the results of the first one,
		 * the last one does not run because it is false.
		 */
		// What is the difference between the first and second part?
		// The first one uses else if and else statements, while the second one uses
		// only if statements. This causes the first one to only run of the options,
		// while the second one checks all of them.

	}
}