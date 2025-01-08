package unit3;

import hsa_new.Console;
import java.awt.Color;

public class CulminatingAssignment {
	/**
	 * Entry point to the program.
	 * @param args
	 */	
	static Console c;
	public static void main(String[] args) {
		c = new Console(30, 100, 15, "Connect4");
		int turn = 1;
		boolean win = false;
		boolean running = true;
		gridDisplay();
		while (running == true) {
			c.print("Where would you like to place your token? ");
			token(turn, columnCheck(c.readInt()), 440 - rowCheck(1));
			if (turn == 1) {
				turn = 2;
			} else {
				turn = 1;
			}
			if (win)
				running = false;
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

	public static int rowCheck(int row) {
		boolean[] row1 = new boolean[6];
		for (int i = 0; i < row1.length; i++) {
			if (!row1[i]) {
				row1[i] = true;
				row = (i+1)*20;
				break;
			} else if (row1[i] && !row1[i+1]) {
				row1[i+1] = true;
				row = (i+1)*20;
				break;
			}
		}
		return row;
	}
	
	public static int columnCheck(int column) {
//		boolean[] row1 = new boolean[6];
//		for (int i = 0; i < row1.length; i++) {
//			if (!row1[i]) {
//				row1[i] = true;
//				column = (i+1)*20;
//				break;
//			} else if (row1[i] && !row1[i+1]) {
//				row1[i+1] = true;
//				column = (i+1)*20;
//				break;
//			}
//		}
		if (column < 8) {
			return (column - 1)*70 + 20;
		} else
			return 0;
	}

	public static void token(int player, int column, int row) {
		if (player == 1)
			c.setColor(Color.red);
		if (player == 2)
			c.setColor(Color.yellow);
		c.fillOval(column, row, 50, 50);
	}
}
