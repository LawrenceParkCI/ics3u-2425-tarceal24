package unit3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import hsa_new.Console;

/**
 * Demonstrates how to load and display gif or jpg images in a console
 * application. You must have the latest version of _new for this to
 * work. May 13, 2008. Modified September 15, 2008, and September 23, 2009.
 *
 * @author Sam Scott
 **/

public class ImageExample
{
	static Console c = new Console ();;           // The output console

	public static void main (String[] args) 
	{

		// These two lines load the image "robot.jpg" and give it the name "jpgImage"
		// Note that you have to include the package name in the file name

		BufferedImage robotJpg = null;
		BufferedImage robotGif = null;
		try {

			robotJpg = ImageIO.read(new File("src/objects/avatar.png"));
			robotGif = ImageIO.read(new File ("src/kemp/project/robot.gif"));

		} catch (IOException e) {
			System.err.println("There was an error loading the image.");
			e.printStackTrace(); //prints the error and line of code

		}


	
		// NOTE - java can also handle images in the .png format, and will respect
		// transparency values.
		

		// This line displays the jpeg image at top left location 0, 0
		// Don't worry about what null means, but you do need to include it
		// Note that the image name "jpgImage" is the first parameter
		c.drawImage (robotJpg, 0, 0, null);

		// These lines draw some more images scaled to 100 by 100 pixels.
		c.drawImage (robotJpg, 400, 0, 100, 100, null);
		c.drawImage (robotGif, 400, 100, 100, 100, null);
		c.drawImage (robotJpg, 400, 200, 100, 100, null);
		c.drawImage (robotGif, 400, 300, 100, 100, null);

		// *************************************
		// THE DRAWIMAGE COMMANDS ARE
		// c.drawImage(image, x, y, null) OR
		// c.drawImage(image, x, y, width, height, null)
		// *************************************

	} // main method
} // ImageTest class

