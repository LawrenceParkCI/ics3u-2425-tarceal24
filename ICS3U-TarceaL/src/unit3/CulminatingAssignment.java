package unit3;

import hsa_new.Console;
import java.awt.Color;

/**
 * Description: Runs a 2 player game of Connect 4
 * Date: TBD
 * @author Luca Tarcea
 */
public class CulminatingAssignment {
	/**
	 * Entry point to the program.
	 * @param args
	 */	
	static Console c;
	public static void main(String[] args) {
		c = new Console(30, 100, 15, "Connect4");
		int player = 1;
		boolean win = false;
		boolean running = true;
		gridDisplay();
		while (running == true) {
			c.print("Player " + player + ". Where would you like to place your token? ");
			token(player);
			if (player == 1) {
				player = 2;
			} else {
				player = 1;
			}
			if (win) {
				c.println("Player " + player + " wins!");
				running = false;
			}
		}
	}

	public static void columnDisplay(int xValue, int yValue) {
		c.setColour(Color.white);
		for (int i = 0; i < 6; i++)
			c.fillOval(xValue, yValue, 50, 50);
	}

	public static void gridDisplay() {
		int[] x = {20, 90, 160, 230, 300, 370, 440};
		int[] y = {70, 140, 210, 280, 350, 420};
		c.setColour(Color.blue);
		c.fillRect(5, 55, 500, 430);
		for (int i = 0; i < x.length; i++) {
			for (int f = 0; f < y.length; f++)
				columnDisplay(x[i], y[f]);
		}
	}

	public static int rowCheck() {
		int row = 0;
		boolean[] row1 = new boolean[6];
		for (int i = 0; i < row1.length; i++) {
			if (!row1[i]) {
				row1[i] = true;
				row = (i+1)*20;
				break;
			} else if (row1[i] && !row1[i+1]) {
				row1[i+1] = true;
				row = i*50 + (i+1)*20;
				break;
			}
		}
		return row;
	}

	public static int columnCheck(int column) {
		if (column < 8 && column > 0)
			return (column - 1)*70 + 20;
		else
			return 0;
	}

	public static void token(int player) {
		if (player == 1)
			c.setColor(Color.red);
		if (player == 2)
			c.setColor(Color.yellow);
		c.fillOval(columnCheck(c.readInt()), 440 - rowCheck(), 50, 50);
	}
}
