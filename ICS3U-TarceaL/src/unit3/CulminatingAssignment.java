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
	static int rows = 6;
	static int columns = 7;
	static boolean[][] cells = new boolean[rows][columns];
	static int[][] cells1 = new int[rows][columns];

	public static void main(String[] args) throws InterruptedException {
		c = new Console(30, 100, 15, "Connect4");
		int playerTurn = 1;
		boolean running = true;
		String str = "Hello... Would you like to play Connect 4? ";
		Thread.sleep(500);
		typeOutput(str);
		str = c.next();
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
				}
				playerTurn = changePlayer(playerTurn);
			} else {
				// c.println("Not a valid option. Try again.");			
			}
		}
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
		int[] column = {20, 90, 160, 230, 300, 370, 440};
		int[] row = {70, 140, 210, 280, 350, 420};
		c.setColour(Color.blue);
		c.fillRect(5, 55, 500, 430);
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++)
				displayColumn(x[i], y[j]);
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
		int column = checkColumn(c.readInt());
		if (player == 1)
			c.setColor(Color.red);
		if (player == 2)
			c.setColor(Color.yellow);
		if (column == -1) {
			c.print("Error - column out of bounds");
			return false;
		} else {
			int row = checkRow(column);
			if (row == -1) {
				c.print("Error - too many pieces in column");
				return false;
			} else {
				c.fillOval(20 + column*70, 420 - row*70, 50, 50);
				cells1[row][column] = player;
			}
		}
		c.setColor(Color.white);
		c.fillRect(0, 20, 400, 22);
		return true;
	}

	public static boolean checkWin() {
		for (int i = 0; i < columns - 4; i++) {
			for (int j = 0; j < rows - 1; j++) {
				if (cells1[j][i] != 0 && cells1[j][i] == cells1[j][i+1] && 
						cells1[j][i+1] == cells1[j][i+2] && cells1[j][i+2] == cells1[j][i+3]) { // 4 in a row
					return true;
				} else if (cells1[j][i] != 0 && cells1[j][i] == cells1[j+1][i] &&
						cells1[j+1][i] == cells1[j+2][i] && cells1[j+2][i] == cells1[j+3][i]){ // 4 in a column
					return true;
				} else if (cells1[j][i] != 0 && cells1[j][i] == cells1[j+1][i+1] &&
						cells1[j+1][i+1] == cells1[j+2][i+2] && cells1[j+2][i+2] == cells1[j+3][i+3]) { // 4 diagonal up-right/down-left
					return true;
				} else if (i > 2 && cells1[j][i] != 0 && cells1[j][i] == cells1[j+1][i-1] &&
						cells1[j+1][i-1] == cells1[j+2][i-2] && cells1[j+2][i-2] == cells1[j+3][i-3]) { // 4 diagonal up-left/down-right
					return true;
				}
			}
		}
		return false;
	}

	public static void typeOutput(String str) {
		for (int i = 0; i < str.length(); i++) {
			c.print(str.charAt(i));
			if (str.charAt(i) != ' ')
				Thread.sleep(100);
			if (str.charAt(i) = '.' || str.charAt(i) = '!')
				Thread.sleep(500);
		}
	}
}
