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
		d = new Console(10, 80, 15, "Text");
		startGame();
		c = new Console(21, 57, 15, "Connect4");
		while (running == true) {
			displayGrid();
			playerTurn = 1;
			while (game = true) {
				d.setCursor(1,1);
				d.setColor(Color.white);
				d.fillRect(621, 0, 9, 21);
				d.setCursor(5, 6);
				d.print("Player " + playerTurn + "'s turn. Which column would you like to place your token in? ");
				if (placeToken(playerTurn)) {
					if (checkWin()) {
						d.clear();
						game = false;
						d.setCursor(5, 18);
						typeOutput("Player " + playerTurn + " wins! Would you like to play again? ");
						String userInput = "";
						while (!(userInput == "no" || userInput == "yes")) {
							userInput = d.readLine();
							d.clear();
							d.setCursor(1, 1);
							if (userInput.equalsIgnoreCase("no")) {
								typeOutput("Thank you for playing :)");
								running = false;
								Thread.sleep(1470);
								c.close();
								d.close();
							} else if (userInput.equalsIgnoreCase("no")) {
								typeOutput("Alright. Restarting game.");
								Thread.sleep(900);
								c.clear();
								d.clear();
							} else {
								d.setCursor(5, 18);
								d.println("Player " + playerTurn + " wins! Would you like to play again? ");
								typeOutput("Not a valid option. Try again ");
							}
						}
					}
					playerTurn = changePlayer(playerTurn);
				} else {
					d.println("Not a valid option. Try again. ");
				}
			}
		}
	}

	public static void startGame() throws InterruptedException {
		d.setCursor(5, 18);
		typeOutput("Welcome to Connect 4! Press Any Key To Start.");
		d.getChar();
		d.clear();
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

		int[] column = {15, 85, 155, 225, 295, 365, 435};
		int[] row = {10, 80, 150, 220, 290, 360};
		c.setColour(Color.blue);
		c.fillRect(0, 0, 500, 430);
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++)
				displayColumn(column[i], row[j]);
			//				displayColumn(grid[i][j], grid[j][i]);
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
				c.fillOval(15 + column*70, 360 - row*70, 50, 50);
				cellValue[row][column] = player;
			}
		}
		d.setColor(Color.white);
		d.fillRect(0, 20, 400, 22);
		return true;
	}

	public static boolean checkWin() {
		for (int i = 0; i < columns - 3; i++) {
			for (int j = 0; j < rows - 3; j++) {
				if (cellValue[j][i] != 0 && cellValue[j][i] == cellValue[j][i+1] && 
						cellValue[j][i+1] == cellValue[j][i+2] && cellValue[j][i+2] == cellValue[j][i+3]) { // 4 in a row
					return true;
				} else if (cellValue[j][i] != 0 && cellValue[j][i] == cellValue[j+1][i] &&
						cellValue[j+1][i] == cellValue[j+2][i] && cellValue[j+2][i] == cellValue[j+3][i]){ // 4 in a column
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
				Thread.sleep(30);
			if (str.charAt(i) == '.' || str.charAt(i) == '!')
				Thread.sleep(200);
		}
	}
}
