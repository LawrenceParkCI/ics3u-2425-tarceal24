package unit1;
import java.util.Scanner;
/**
 * 
 * 
 */
public class RectangleArea {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length,width,depth;
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the length of the cube and <Enter>");
		length = sc.nextInt();
		System.out.println("Type in the width of the cube and <Enter>");
		width = sc.nextInt();
		System.out.println("Type in the depth of the cube and <Enter>");
		depth = sc.nextInt();
		int area = length*width;
		int volume = length*width*depth;
		System.out.println("The area of your cube is "+area);
		System.out.println("The volume of your cube is "+volume);
		sc.close();

	}

}
