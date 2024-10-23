package unit1;
import java.util.Scanner;
/**
 * 
 */
public class InputFP {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Type in a floating point number and <Enter>");
		num1 = sc.nextDouble();
		System.out.println("Type in another floating point number and <Enter>");
		num2 = sc.nextDouble();
		System.out.println();
		System.out.println("The first number entered was "+num1);
		System.out.println("The second number entered was "+num2);

		sc.close();
	}

}
