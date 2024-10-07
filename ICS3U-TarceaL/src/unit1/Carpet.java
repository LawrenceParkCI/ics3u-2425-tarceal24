package unit1;
import java.util.Scanner;
/**
 * 
 */
public class Carpet {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carpet;
		int length;
		int width;
		int cost;
		System.out.println("Type in the length of the room in metres and <Enter>");
		length = sc.nextInt();
		System.out.println("Type in the width of the room in metres and <Enter>");
		width = sc.nextInt();
		System.out.println("Type in the cost of the carpet per square-metre and <Enter>");
		cost = sc.nextInt();
		carpet = length*width*cost;
		System.out.println("The cost of the carpet is $"+carpet+".");

	}

}
