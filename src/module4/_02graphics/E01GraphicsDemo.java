package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.25, 0.75, 0.01);

		//Draw a larger green point someplace else
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.5, 0.75, 0.02);

		//Draw an unfilled red triangle somewhere
		StdDraw.setPenColor(Color.RED);
		double [] y = {0.1,0.2,0.1};
		double [] x = {0.1,0.2,0.3};
		StdDraw.polygon(x, y);

		//Draw a filled yellow circle somewhere
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.8,0.5,0.09);

		//Draw a filled blue rectangle somewhere
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.9,0.1,0.05,0.08);

		StdDraw.clear();
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.5);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5,0.5,0.25);
		double [] c = {0.4,0.45,0.4,0.47,0.5,0.57,0.6,0.57,0.58,0.50};
		double [] d = {0.4,0.45,0.5,0.5,0.55,0.5,0.5,0.45,0.4,0.45};
		StdDraw.setPenColor(Color.RED);
		StdDraw.polygon(c,d);
	}
}
