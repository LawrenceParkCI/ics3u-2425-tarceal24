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


	public static void main(String[] args) throws InterruptedException {
		c = new Console(30, 100, 15, "Connect4");
		int playerTurn = 1;
		boolean running = true;
		displayGrid();
		while (running == true) {
			c.setCursor(1,1);
			c.setColor(Color.white);
			c.fillRect(468, 0, 9, 21);
			c.print("Player " + playerTurn + ". Where would you like to place your token? ");
			if (placeToken(playerTurn)) {
				if (checkWin()) {
					c.println("Player " + playerTurn + " wins!");
					running = false;
					Thread.sleep(1500);
					c.close();
				}
				playerTurn = changePlayer(playerTurn);
			} else {
				
				
				
				
				
			}
		}
	}

	public static int changePlayer(int player) {
		if (player == 1) {
			player = 2;
		} else {
			player = 1;
		}
		return player;
	}

	public static void displayColumn(int xValue, int yValue) {
		c.setColour(Color.white);
		for (int i = 0; i < 6; i++)
			c.fillOval(xValue, yValue, 50, 50);
	}

	public static void displayGrid() {
		int[] x = {20, 90, 160, 230, 300, 370, 440};
		int[] y = {70, 140, 210, 280, 350, 420};
		c.setColour(Color.blue);
		c.fillRect(5, 55, 500, 430);
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++)
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
		if (column < 8 && column > 0)
			return column - 1;
		else
			return -1;
	}

	public static boolean placeToken(int player) {
		if (player == 1)
			c.setColor(Color.red);
		if (player == 2)
			c.setColor(Color.yellow);
		int column = checkColumn(c.readInt());
		if (column == -1) {
			c.print("Error - column out of bounds");
			return false;
		} else {
			int row = checkRow(column);
			if (row == -1) {
				c.print("Error - too many pieces in column");
				return false;
			} else {
				c.fillOval(column*70 + 20, 420 - row*70, 50, 50);
			}
		}
		c.setColor(Color.white);
		c.fillRect(0, 20, 400, 22);
		return true;
	}

	public static boolean checkWin() {
		return false;
	}
}
