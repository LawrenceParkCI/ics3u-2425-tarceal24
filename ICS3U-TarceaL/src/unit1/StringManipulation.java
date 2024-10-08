package unit1;

import java.util.Scanner;

/**
 * Description: Displays any inputted string in a variety of ways. Date:
 * 07/10/24
 * 
 * @author Luca Tarcea
 */
public class StringManipulation {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables
		String sentence;
		int length;
		char letter;
		String first;
		String last;
		int space, space1;
		
		// Scans input and assigns variables
		System.out.println("Type a sentence and <Enter>");
		sentence = sc.nextLine();
		length = sentence.length();
		letter = sentence.charAt(5);
		space = sentence.indexOf(" ");
		space1 = sentence.lastIndexOf(" ");
		first = sentence.substring(0, space);
		last = sentence.substring(space1);
		
		// Prints the sentence and other information
		System.out.println(sentence);
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println("The sentence is " + length + " characters long.");
		System.out.println("The character at index 5 is " + letter + ".");
		System.out.println("The first word of the string is " + first + ".");
		System.out.println("The last word of the string is" + last + ".");

	}

}
