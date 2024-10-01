package unit1;

/**
 * Description: This program uses operators for mathematical equations
 * Date: 01/10/24
 * @author Luca Tarcea
 */
public class MathOperators {
	/**
	 * Entry point to the program
	 * @param
	 */
	public static void main(String[] args) {
		/*
		 * Pre: Kind of Math, but not really What do you notice is happening?
		 */

		System.out.println("Butter" + "fly");

		System.out.println("1 + 2 + 3 + 4 + 5");

		System.out.println(1 + 2 + 3 + 4 + 5);

		System.out.println(1 + 2 + "3 + 4 + 5");

		System.out.println("1 + 2 + 3" + 4 + 5);

		// Why do you think the last two outputs act so differently?
		// They have both mathematical equations and text to print
		// Summary: What are two possible roles of the + operator?
		// Add and differentiate between two statements
		/*
		 * Part 1 Figure out what is the meaning of each operator. Use print statements
		 * to verify your answer and explain.
		 */

		// + means: Add
		System.out.println();
		System.out.println(4+2);
		// - means: Subtract
		System.out.println(4-2);
		// * means: Multiply
		System.out.println(4*2);
		// / means: Divide
		System.out.println(4/2);
		// Print the following expression: (3 + 2) * 5
		System.out.println();
		System.out.println((3+2)*5);
		// Print the following expression: 3 + 2 * 5
		System.out.println(3+2*5);
		// Was this expected? Why or why not?
		// Yes, follows order of operations
		/*
		 * Part 2 - Calculate Using Operators Print out, using one println statement,
		 * what 45 degrees Celsius is in Fahrenheit
		 * 
		 * Print out, using a print and a println statement, what 900 Fahrenheit is in
		 * Celsius
		 */
		System.out.println();
		System.out.println("45 degrees Celsius is "+((45*9/5)+32)+" in Fahrenheit");
		System.out.println("900 degrees Farenheit is "+(900-32)*5/9+" in Celsius");

		/*
		 * Part 3 Figure out what is the meaning of % as a math operator. Use print
		 * statements to check your answer.
		 */
		System.out.println();
		System.out.println(14%2);
		System.out.println(40%3);
		System.out.println(17%5);
		// I think % means: find the remainder

	}
}