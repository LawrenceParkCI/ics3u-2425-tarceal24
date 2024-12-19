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
//		System.out.println("The distance from (2, -1) to (-3, -2) is " + distance(2, -3, -1, -2) + ".");
//		System.out.println("The hypotenuse of a triangle with side lengths 3 and 4 is " + hypotenuse(3, 4) + ".");
//		System.out.println("The number factors in 20 is " + numOfFactors(20) + ".");
//		System.out.println("13 is prime: " + isPrime(13) + ".");
//		int[] array1 = {1, 2, 3, 4, 5};
//		System.out.println("The sum of all the integers in the array is " + sum(array1) + ".");
//		double[] array2 = {3.6, 4.2, 2.3, 2};
//		System.out.println("The sum of all the doubles in the array is " + (double) ((int) (sum(array2)*10))/10 + ".");
//		int[] array3 = {1, 2, 3, 0, 5};
//		System.out.println("The index of the smallest integer in the array is " + min(array3) + ".");
//		double[] array4 = {30, 22, 33, 26, 17};
//		System.out.println("The index of the smallest double in the array is " + min(array4) + ".");
//		int[] array5 = {10, 12, 23, 14, 18};
//		System.out.println("The index of the largest integer in the array is " + max(array5) + ".");
//		double[] array6 = {23.1, 23.2, 16, 10, 8};
//		System.out.println("The index of the largest double in the array is " + max(array6) + ".");
//		int[] array7 = {81, 23, 68, 29, 10};
//		System.out.println("The difference of the largest and smallest integers in the array is " + bigDifference(array7) + ".");
//		double[] array8 = {81.3, 23.2, 68.5, 29.8, 10};
//		System.out.println("The difference of the largest and smallest doubles in the array is " + bigDifference(array8) + ".");
		int num = 100;
		System.out.println("The factors of " + num + " are:");
		for (int i = 0; i < num; i++) {
			if (factors(num)[i] != 0)
				System.out.println(factors(num)[i]);
		}
		System.out.println(num);
		
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

	public static int sum(int[] num) {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}

	public static double sum(double[] num) {
		double total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}
	
	public static int min(int[] num) {
		int index = 0;
		int least = num[0];
		for (int i = 0; i < num.length; i++) {
			if (least > num[i]) {
				least = num[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int min(double[] num) {
		int index = 0;
		double least = num[0];
		for (int i = 0; i < num.length; i++) {
			if (least > num[i]) {
				least = num[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int max(int[] num) {
		int index = 0;
		int greatest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (greatest < num[i]) {
				greatest = num[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int max(double[] num) {
		int index = 0;
		double greatest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (greatest < num[i]) {
				greatest = num[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int bigDifference(int[] num) {
		int least = min(num);
		int greatest = max(num);
		int difference = num[greatest] - num[least];
		return difference;
	}
	
	public static double bigDifference(double[] num) {
		int least = min(num);
		int greatest = max(num);
		double difference = num[greatest] - num[least];
		return difference;
	}
	
	public static int[] factors(int num) {
		int[] array = new int[100];
		int index = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				array[index] = i;
				index++;
			}
		}
		return array;
	}
}
