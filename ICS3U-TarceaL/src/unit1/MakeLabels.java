package unit1;
import java.util.Scanner;
/**
 * 
 */
public class MakeLabels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String subject;
		String name;
		System.out.println("Type in the subject and name, then press <Enter>");
		subject = sc.nextLine();
		name = sc.nextLine();
		System.out.println();
		System.out.println("***************************");
		System.out.println("Tenzin");
		System.out.println(subject);
		System.out.println(name);
		System.out.println("***************************");
		sc.close();

	}

}
