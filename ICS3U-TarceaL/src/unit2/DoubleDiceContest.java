package unit2;

/**
 * Description: User vs. computer dice game
 * Date: 18/11/24
 * @author Luca Tarcea
 */
public class DoubleDiceContest {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for
		 * the computer. The program should output the total of the two dice for both
		 * the user and the computer, then announce who won: the computer, the user, or
		 * say it was a tie.
		 */
		int userDie1 = (int) (Math.random() * 6) + 1;
		int userDie2 = (int) (Math.random() * 6) + 1;
		int computerDie1 = (int) (Math.random() * 6) + 1;
		int computerDie2 = (int) (Math.random() * 6) + 1;
		int computerScore = computerDie1 + computerDie2;
		int userScore = userDie1 + userDie2;

		System.out.println("The user rolled a " + userScore);
		System.out.println("The computer rolled a " + computerScore);

		if (userScore > computerScore)
			System.out.println("The user won!");
		else if (userScore < computerScore)
			System.out.println("The computer won.");
		else
			System.out.println("It was a tie.");
	}
}
