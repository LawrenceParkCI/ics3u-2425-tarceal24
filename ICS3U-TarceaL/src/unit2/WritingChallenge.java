package unit2;

import java.io.*;
import java.util.Scanner;

/**
 * Description: Date: 27/11/24
 * 
 * @author Luca Tarcea
 */

public class WritingChallenge {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Ask the user how many grades they want to enter. Write those grades into
		 * separates lines in a file called grades.txt.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("How many grades would you like to enter? ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			try {
				File file = new File("grades.txt");
				PrintStream grades = new PrintStream(file);
				System.out.println("What is your grade? ");
				int grade = sc.nextInt();
				grades.println(grade);
				grades.close();
			} catch (IOException e) {
				System.out.println("Sorry, cannot write to that file.");
			}
		}

		sc.close();

	}
}