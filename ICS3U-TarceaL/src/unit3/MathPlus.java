package unit3;

/**
 * Description: Performs basic numeric operations such as arithmetic, square
 * root, and exponential functions.
 * Date: 17/12/24
 * @author Luca Tarcea
 */

public class MathPlus {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The distance from (2, -1) to (-3, -2) is " + distance(2, -3, -1, -2) + ".");
		System.out.println("The hypotenuse of a triangle with side lengths 3 and 4 is " + hypotenuse(3, 4) + ".");
		System.out.println("The number factors in 20 is " + numOfFactors(20) + ".");
		System.out.println("13 is prime: " + isPrime(13) + ".");
	}

	/**
	 * Description: Calculates the distance between two given points
	 * 
	 * @param x1 x value of first point
	 * @param y1 y value of first point
	 * @param x2 x value of second point
	 * @param y2 y value of second point
	 * @return difference of points
	 */
	public static double distance(int x1, int y1, int x2, int y2) {
		double c = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		return c;
	}

	/**
	 * Description: Calculates the hypotenuse of two given side lengths
	 * 
	 * @param a first side length
	 * @param b second side length
	 * @return hypotenuse of side lengths
	 */
	public static double hypotenuse(double a, double b) {
		double c = distance((int) a, (int) b, 0, 0);
		return c;
	}

	/**
	 * Description: Determines the number of factors in a given integer
	 * 
	 * @param num integer
	 * @return number of factors of integer
	 */
	public static int numOfFactors(int num) {
		int factors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors++;
			}
		}
		return factors;
	}

	/**
	 * Description: Determines whether a given integer is prime
	 * 
	 * @param num integer
	 * @return if integer is prime or not
	 */
	public static boolean isPrime(int num) {
		if (numOfFactors(num) == 2)
			return true;
		else
			return false;
	}
}
