package unit3;

import hsa_new.Console;
import java.awt.Color;

/**
 * Description: Runs a 2 player game of Connect 4
 * Date: 15/01/25
 * @author Luca Tarcea
 */
public class CulminatingAssignment {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	static Console c;
	static Console d;
	static int rows = 6;
	static int columns = 7;
	static boolean[][] cells = new boolean[rows][columns];
	static int[][] cellValue = new int[rows][columns];

	public static void main(String[] args) throws InterruptedException {
		int playerTurn;
		boolean game, running = true;
		d = new Console(30, 100, 15, "Text");
		startGame();
		c = new Console(30, 100, 15, "Connect4");
<<<<<<< HEAD
		int playerTurn = 1;
		boolean running = true;
		String str = "Hello... Would you like to play Connect 4? ";
		Thread.sleep(500);
		typeOutput(str);
		str = c.readLine();
		if (str.equalsIgnoreCase("yes")) {
			str = "Great!";
			typeOutput(str);
		} else if (str.equalsIgnoreCase("no")) {
			str = "Too bad... See you next time.";
			typeOutput(str);
			Thread.sleep(1000);
			c.close();
		} else {
			c.print("Error - not a valid response");
		}
		str = "Player " + playerTurn + "'s turn. Which column would you like to place your token in? ";
		displayGrid();
		while (running == true) {
			c.setCursor(1,1);
			c.setColor(Color.white);
			c.fillRect(621, 0, 9, 21);
			typeOutput(str);
			if (placeToken(playerTurn)) {
				if (checkWin()) {
					str = "Player " + playerTurn + " wins!";
					typeOutput(str);
					running = false;
					Thread.sleep(1400);
					c.close();
=======
		while (running = true) {
			displayGrid();
			playerTurn = 1;
			game = true;
			while (game == true) {
				d.setCursor(1,1);
				// d.setColor(Color.white);
				// d.fillRect(621, 0, 9, 21);
				d.print("Player " + playerTurn + "'s turn. Which column would you like to place your token in? ");
				if (placeToken(playerTurn)) {
					if (checkWin()) {
						game = false;
						typeOutput("Player " + playerTurn + " wins! Would you like to play again? ");
						if (!d.readLine().equalsIgnoreCase("yes")) {
							typeOutput("Thank you for playing :)");
							running = false;
							Thread.sleep(1400);
							c.close();
							d.close();
						}
						typeOutput("Alright. Restarting game.");
						Thread.sleep(1000);
						// c.clear();
						d.clear();
					}
					playerTurn = changePlayer(playerTurn);
				} else {
					// d.println("Not a valid option. Try again.");			
>>>>>>> branch 'main' of https://github.com/LawrenceParkCI/ics3u-2425-tarceal24.git
				}
			}
		}
	}

	public static void startGame() throws InterruptedException {
		String userInput = "";
		while (!(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("no"))) {
			typeOutput("Hello... Would you like to play Connect 4? ");
			userInput = d.readLine();
			if (userInput.equalsIgnoreCase("yes")) {
				typeOutput("Great!");
				Thread.sleep(1000);
			} else if (userInput.equalsIgnoreCase("no")) {
				typeOutput("Too bad... See you next time.");
				Thread.sleep(1000);
				c.close();
				d.close();
			} else {
				typeOutput("Not a valid response. Try again.");
				Thread.sleep(1000);
				d.clear();
			}
		}
		d.setColor(Color.white);
		// d.fillRect(0, 20, 400, 22);
		// d.fillRect(0, 0, 420, 22);
	}

	public static int changePlayer(int player) {
		if (player == 1)
			player = 2;
		else
			player = 1;
		return player;
	}

	public static void displayColumn(int column, int row) {
		c.setColour(Color.white);
		c.fillOval(column, row, 50, 50);
	}

	public static void displayGrid() {
		int[][] grid = new int [rows][columns];
		for (int i = 0; i < columns; i++)
			for (int j = 0; j < rows; j++)
				grid[j][i] = 20 + 70*i;
		
		int[] column = {20, 90, 160, 230, 300, 370, 440};
		int[] row = {70, 140, 210, 280, 350, 420};
		c.setColour(Color.blue);
		c.fillRect(5, 55, 500, 430);
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++)
<<<<<<< HEAD
				displayColumn(column[i], row[j]);
=======
//				displayColumn(column[i], row[j]);
				displayColumn(grid[i][j], grid[j][i]);
>>>>>>> branch 'main' of https://github.com/LawrenceParkCI/ics3u-2425-tarceal24.git
		}
	}

	public static int checkRow(int column) {
		for (int i = 0; i < rows; i++) {
			if (!cells[i][column]) {
				cells[i][column] = true;
				return i;
			}
		}
		return -1;
	}

	public static int checkColumn(int column) {
		if (column > columns || column < 1)
			return -1;
		else
			return column - 1;
	}

	public static boolean placeToken(int player) {
		int column = checkColumn(d.readInt());
		if (player == 1)
			c.setColor(Color.red);
		if (player == 2)
			c.setColor(Color.yellow);
		if (column == -1) {
			d.print("Error - column out of bounds");
			return false;
		} else {
			int row = checkRow(column);
			if (row == -1) {
				d.print("Error - too many pieces in column");
				return false;
			} else {
				c.fillOval(20 + column*70, 420 - row*70, 50, 50);
				cellValue[row][column] = player;
			}
		}
		// d.setColor(Color.white);
		// d.fillRect(0, 20, 400, 22);
		return true;
	}

	public static boolean checkWin() {
		for (int i = 0; i < columns - 4; i++) {
			for (int j = 0; j < rows - 1; j++) {
				if (cellValue[j][i] != 0 && cellValue[j][i] == cellValue[j][i+1] && 
						cellValue[j][i+1] == cellValue[j][i+2] && cellValue[j][i+2] == cellValue[j][i+3]) { // 4 in a row
					return true;
				} else if (cellValue[j][i] != 0 && cellValue[j][i] == cellValue[j+1][i] &&
						cellValue[j+1][i] == cellValue[j+2][i] && cellValue[j+2][i] == cellValue[j+3][i]){ // 4 in a column error
					return true;
				} else if (cellValue[j][i] != 0 && cellValue[j][i] == cellValue[j+1][i+1] &&
						cellValue[j+1][i+1] == cellValue[j+2][i+2] && cellValue[j+2][i+2] == cellValue[j+3][i+3]) { // 4 diagonal up-right/down-left
					return true;
				} else if (i > 2 && cellValue[j][i] != 0 && cellValue[j][i] == cellValue[j+1][i-1] &&
						cellValue[j+1][i-1] == cellValue[j+2][i-2] && cellValue[j+2][i-2] == cellValue[j+3][i-3]) { // 4 diagonal up-left/down-right
					return true;
				}
			}
		}
		return false;
	}

	public static void typeOutput(String str) throws InterruptedException {
		for (int i = 0; i < str.length(); i++) {
			d.print(str.charAt(i));
			if (str.charAt(i) != ' ')
<<<<<<< HEAD
				Thread.sleep(100);
			if (str.charAt(i) == '.' || str.charAt(i) == '!')
				Thread.sleep(500);
=======
				Thread.sleep(30);
			if (str.charAt(i) == '.' || str.charAt(i) == '!')
				Thread.sleep(200);
>>>>>>> branch 'main' of https://github.com/LawrenceParkCI/ics3u-2425-tarceal24.git
		}
	}
}