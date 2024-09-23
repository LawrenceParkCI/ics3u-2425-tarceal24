package unit1;
/**
 * Description: This program prints my information
 * Date: 20/09/24
 * @author Luca Tarcea
 */
public class AboutMe {

	public static void main(String[] args) {
		// This prints the information to the console
		System.out.println("Luca Tarcea");
		System.out.println("Grade 11");
		System.out.println("Ms. Kemp");
		System.out.println("Lawrence Park CI");
		System.out.println("\"Go Panthers!\"");
		System.out.format("\nDay: %-20sStart Time: %s", "Monday", "9:00");
		System.out.format("\nDay: %-20sStart Time: %s", "Tuesday", "9:00");
		System.out.format("\nDay: %-20sStart Time: %s", "Wednesday", "9:55");
		System.out.format("\nDay: %-20sStart Time: %s", "Thursday", "9:00");
		System.out.format("\nDay: %-20sStart Time: %s", "Friday", "9:00");
	}

}