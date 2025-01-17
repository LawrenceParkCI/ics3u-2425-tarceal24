package unit3;

import hsa_new.Console;
import java.awt.Color;

/**
 * Description: Runs a 2 player game of Connect 4
 * Date: 16/01/25
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
	static int[][] cellToken = new int[rows][columns];

	public static void main(String[] args) throws InterruptedException {
		int playerTurn;
		boolean game, running = true, playedGame = false;
		d = new Console(10, 80, 15, "Text");
		while (running == true) {
			startGame(playedGame);
			game = true;
			playerTurn = 1;
			while (game) {
				d.setCursor(5, 5);
				d.print("Player " + playerTurn + "'s turn. Which column would you like to place your token in? ");
				if (placeToken(playerTurn)) {
					d.clear();
					if (checkWin()) {
						game = false;
						d.setCursor(5, 18);
						typeOutput("Player " + playerTurn + " wins! Would you like to play again? ");
						String userInput = "";
						while (!(userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("yes"))) {
							userInput = d.readLine();
							d.clear();
							d.setCursor(1, 1);
							if (userInput.equalsIgnoreCase("no")) {
								typeOutput("Thank you for playing :)");
								running = false;
								Thread.sleep(1470);
								c.close();
								d.close();
							} else if (userInput.equalsIgnoreCase("yes")) {
								typeOutput("Alright. Restarting game.");
								Thread.sleep(900);
								c.close();
								d.clear();
								playedGame = true;
							} else {
								d.setCursor(5, 18);
								d.println("Player " + playerTurn + " wins! Would you like to play again? ");
								d.setCursor(6, 24);
								typeOutput("Not a valid option. Try again ");
							}
						}
					}
					playerTurn = changePlayer(playerTurn);
				} else {
					d.setCursor(6, 24);
					d.println("Not a valid option. Try again. ");
				}
			}
		}
	}

	/**
	 * Description: Starts running the game
	 * @param gamePlayed - Checks if game has been played before in the same session
	 * @throws InterruptedException
	 */
	public static void startGame(boolean gamePlayed) throws InterruptedException {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {
				cells[i][j] = false;
				cellToken[i][j] = 0;
			}
		if (!gamePlayed) {
			d.setCursor(5, 18);
			typeOutput("Welcome to Connect 4! Press Any Key To Start.");
			d.getChar();
			d.clear();
		}
		drawBoard();
	}

	/**
	 * Description: Changes which players turn it is
	 * @param player - Whose turn it is
	 * @return int - Whose turn it is
	 */
	public static int changePlayer(int player) {
		if (player == 1)
			player = 2;
		else
			player = 1;
		return player;
	}

	/**
	 * Description: Creates columns of circles
	 */
	public static void drawCols() {
		int[] column = { 15, 85, 155, 225, 295, 365, 435 };
		int[] row = { 10, 80, 150, 220, 290, 360 };
		c.setColour(Color.white);
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++)
				c.fillOval(column[i], row[j], 50, 50);
		}
	}

	/**
	 * Description: Creates a grid that the game is played on
	 */
	public static void drawBoard() {
		c = new Console(21, 57, 15, "Connect4");
		c.setColour(Color.blue);
		c.fillRect(0, 0, 500, 430);
		for (int i = 0; i < columns; i++) {
			drawCols();
		}
	}

	/**
	 * Description: Checks what row to draw a circle
	 * @param column - Which column a circle should be drawn
	 * @return int - What row a circle should be drawn
	 */
	public static int checkRow(int column) {
		for (int i = 0; i < rows; i++) {
			if (!cells[i][column]) {
				cells[i][column] = true;
				return i;
			}
		}
		return -1;
	}

	/**
	 * Description: Checks if an integer is a valid column
	 * @param column - What column the user chose
	 * @return int - Which column a circle should be drawn
	 */
	public static int checkColumn(int column) {
		if (column > columns || column < 1)
			return -1;
		else
			return column - 1;
	}

	/**
	 * Description: Places a "token" by drawing a circle
	 * @param player - Whose turn it is
	 * @return boolean - Whether or not a circle should be drawn
	 */
	public static boolean placeToken(int player) {
		int column = checkColumn(d.readInt());
		if (player == 1)
			c.setColor(Color.red);
		if (player == 2)
			c.setColor(Color.yellow);
		if (column == -1) {
			return false;
		} else {
			int row = checkRow(column);
			if (row == -1) {
				return false;
			} else {
				c.fillOval(15 + column * 70, 360 - row * 70, 50, 50);
				cellToken[row][column] = player;
			}
		}
		d.setColor(Color.white);
		d.fillRect(0, 20, 400, 22);
		return true;
	}

	/**
	 * Description: Checks if the game has been won
	 * @return boolean - Whether or not the game has been won
	 */
	public static boolean checkWin() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j < 3) {
					if (cellToken[i][j] != 0 && cellToken[i][j] == cellToken[i][j + 1]
							&& cellToken[i][j + 1] == cellToken[i][j + 2]
							&& cellToken[i][j + 2] == cellToken[i][j + 3]) // 4 in a row
						return true;
					else if (cellToken[i][j] != 0 && cellToken[i][j] == cellToken[i + 1][j]
							&& cellToken[i + 1][j] == cellToken[i + 2][j]
							&& cellToken[i + 2][j] == cellToken[i + 3][j]) // 4 in a column
						return true;
				} else {
					if (cellToken[i][j] != 0 && cellToken[i][j] == cellToken[i][j - 1]
							&& cellToken[i][j - 1] == cellToken[i][j - 2]
							&& cellToken[i][j - 2] == cellToken[i][j - 3]) // 4 in a row
						return true;
					else if (cellToken[i][j] != 0 && cellToken[i][j] == cellToken[i + 1][j]
							&& cellToken[i + 1][j] == cellToken[i + 2][j]
							&& cellToken[i + 2][j] == cellToken[i + 3][j]) // 4 in a column
						return true;
				}
				if (j < 4 && i > 2) {
					if (cellToken[i][j] != 0 && cellToken[i][j] == cellToken[i - 1][j + 1]
							&& cellToken[i - 1][j + 1] == cellToken[i - 2][j + 2]
							&& cellToken[i - 2][j + 2] == cellToken[i - 3][j + 3]) { // 4 diagonal up-right/down-left
						return true;
					}
				}
				if (j > 2 && i > 2)
					if (cellToken[i][j] != 0 && cellToken[i][j] == cellToken[i + 1][j - 1]
							&& cellToken[i + 1][j - 1] == cellToken[i + 2][j - 2]
							&& cellToken[i + 2][j - 2] == cellToken[i + 3][j - 3]) // 4 diagonal up-left/down-right
						return true;
			}
		}
		return false;
	}

	/**
	 * Description: Prints output one letter at a time
	 * @param output - A string to be printed
	 * @throws InterruptedException
	 */
	public static void typeOutput(String output) throws InterruptedException {
		for (int i = 0; i < output.length(); i++) {
			d.print(output.charAt(i));
			if (output.charAt(i) != ' ')
				Thread.sleep(30);
			if (output.charAt(i) == '.' || output.charAt(i) == '!')
				Thread.sleep(200);
		}
	}
}
