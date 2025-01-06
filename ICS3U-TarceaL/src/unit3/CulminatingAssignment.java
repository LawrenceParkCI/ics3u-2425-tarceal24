package unit3;

import hsa_new.Console;
import java.awt.Color;

public class CulminatingAssignment {

	public static void main(String[] args) {
		Console c = new Console(2, 5, 300, "Connect 4");
		c.setColour(Color.blue);
		c.fillRect(5, 5, 400, 400);
		c.setColour(Color.white);
		c.fillOval(20, 20, 50, 50);

	}

}
