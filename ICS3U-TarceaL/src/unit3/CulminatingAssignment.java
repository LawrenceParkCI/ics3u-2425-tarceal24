package unit3;

import hsa_new.Console;
import java.util.Scanner;
import java.awt.Color;

public class CulminatingAssignment {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	static Scanner sc;
	static Console c;
	public static void main(String[] args) {
		c = new Console(30, 100, 15, "Connect 4");
		boolean running = true;
		gridDisplay();
		while (running == true) {
			c.print("Where would you like to place your token?");
			tokenCheck(sc.nextInt());
		}

	}

	public static void columnDisplay(int xValue, int yValue) {
		c.setColour(Color.white);
		for (int i = 0; i < 6; i++)
			c.fillOval(xValue, yValue, 50, 50);
	}

	public static void gridDisplay() {
		int[] x = {20, 90, 160, 230, 300, 370, 440};
		int[] y = {20, 90, 160, 230, 300, 370};
		c.setColour(Color.blue);
		c.fillRect(5, 5, 500, 430);
		for (int i = 0; i < x.length; i++) {
			for (int f = 0; f < y.length; f++)
				columnDisplay(x[i], y[f]);
		}
	}
	
	public static boolean tokenCheck(int column) {
		boolean[] column1 = new boolean[6];
		for (int i = 0; i < column1.length; i++) {
			if (column1[i] == true) {
				
			}
		}
		return column1[0];
	}
	
	public static void playerToken() {
		int player = 1;
		if (player == 1) {
			c.fillOval
		}
		if (player == 2){
			
		}
	}
}
