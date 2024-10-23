package unit1;
import java.util.Scanner;
/**
 * 
 */
public class InputChars {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1,ch2,ch3;
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		System.out.print("Together these three letters spell: "+(ch1+ch2+ch3));
		//System.out.println(ch1+ch2+ch3);

		sc.close();
	}

}
