package unit2;

import java.util.Scanner;

/**
 * Description: Finds square root of user input
 * Date: 22/11/24
 * @author Luca Tarcea
 */

public class LoopChallenge2 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Write a program to take the square root of a number typed in by the user.
		 * Your program should use a loop to ensure that the number they typed in is
		 * positive. If the number is negative, you should print out some sort of
		 * warning and make them type it in again.
		 * 
		 * You can get the square root of a number n with Math.sqrt(n). Make sure you
		 * don't do this until the loop is done and you know for sure you've got a
		 * positive number.
		 * 
		 * Use the loop that you didn't use in LoopChallenge1
		 */

		Scanner sc = new Scanner(System.in);
		int sqRoot;

		do {
			System.out.println("Type a positive number and <Enter>");
			sqRoot = sc.nextInt();
			if (sqRoot < 0)
				System.out.println("ERROR!\nThat number is negative.");
		} while (sqRoot < 0);

		System.out.println(Math.sqrt(sqRoot) + " is the square root of that number.");

		sc.close();
	}
}