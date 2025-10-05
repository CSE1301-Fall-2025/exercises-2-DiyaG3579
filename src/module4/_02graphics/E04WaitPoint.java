package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class E04WaitPoint {

	/*
	 * Exercise: Use the StdDraw API to complete the code one
	 * step at a time.
	 */
	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		boolean c = true;
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.5,0.9,"Click Q to End Play");
		while (c == true) {
			boolean isPressed = StdDraw.mousePressed();

			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
		// here, the mouse has been pressed
			if (isPressed == true) {
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.filledCircle(x,y,0.01);
			}
		// here the mouse is released
		
		
		// draw a point at the location of the mouse
		
		
		// here, a q has been typed
		if (StdDraw.isKeyPressed(KeyEvent.VK_Q)) {
			StdDraw.text(0.5, 0.5, "Farewell!");
			c = false;
		}

		StdDraw.pause(100);
		}
		StdDraw.pause(1000);
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.5);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(0.5,0.5,"Re-Run Code to Draw Again");
	}

}
