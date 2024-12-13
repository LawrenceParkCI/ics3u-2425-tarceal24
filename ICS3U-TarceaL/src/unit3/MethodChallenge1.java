package unit3;

/**
 * Description: Calculate the distance between two points
 * Date: 13/12/24
 * @author Luca Tarcea
 */

public class MethodChallenge1 {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		// Complete the function below. Don't forget to comment.
		double d1 = distance(-2, 1, 1, 5);
		System.out.println(" (-2,1) to (1,5) => " + d1);

		double d2 = distance(-2, -3, -4, 4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2);

		System.out.println(" (2,-3) to (-1,-2) => " + distance(2, -3, -1, -2));

		System.out.println(" (4,5) to (4,5) => " + distance(4, 5, 4, 5));
	}

	/**
	 * (Description)
	 * 
	 * @param x1 ->
	 * @param y1 ->
	 * @param x2 ->
	 * @param y2 ->
	 * @return
	 */
	public static double distance(int x1, int y1, int x2, int y2) {
		double a = Math.pow((x2 - x1),2);
		double b = Math.pow((y2 - y1),2);
		double c = a + b;
		double returnValue = Math.sqrt(c);
		return returnValue;
	}
}