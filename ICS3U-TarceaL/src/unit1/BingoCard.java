package unit1;
/**
 * Description:
 * Date: 26/09/24
 * @author Luca Tarcea
 */
public class BingoCard {

	public static void main(String[] args) {
		//This prints the rules to the console
		System.out.println("BINGO CARD\n");
		System.out.println("1. The caller randomly pulls a numbered bingo ball.\n");
		System.out.println("2. The number is placed on the bingo board and called out.\n");
		System.out.println("3. Players look for the called number on their bingo card.\n");
		System.out.println("4. If the number is on a player's bingo card, it is marked off.\n");
		System.out.println("5. Repeat steps 1-4 until a player has five marked spaces in a row.\n");
		System.out.println("6. The player who wins says BINGO.");
		//This prints out the bingo card
		System.out.format("%10S%10S%10S%10S%10S\n","b","i","n","g","o");
		System.out.format("%10d%10d%10d%10d%10d\n",3,21,35,46,66);
		System.out.format("%10d%10d%10d%10d%10d\n",9,28,39,51,72);
		System.out.format("%10d%9d%12S%9d%10d\n",11,19,"free",55,68);
		System.out.format("%10d%10d%10d%10d%10d\n",7,23,44,60,62);
		System.out.format("%10d%10d%10d%10d%10d\n",14,18,40,57,75);

	}

}
