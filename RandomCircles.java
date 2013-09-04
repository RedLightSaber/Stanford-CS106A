/* File RandomCircles.java
 * From CS106A Section Handout #3
 * Question 3
 *
 * Draws a series of 10 circles in the graphics
 * window. Each circle has a random color and 
 * diameter and should fit completely inside the 
 * window.
 */

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;


public class RandomCircles extends GraphicsProgram {
	private static final int NUMBER_CIRCLES = 10;
	
	public void run() {
		for (int i = 0; i < NUMBER_CIRCLES; i++) {
			drawCircle();
		}
	}
	
	private void drawCircle() {
		int r = rgen.nextInt(5,50);
		int maxX = getWidth() - (2*r);
		int maxY = getHeight() - (2*r);
		int x = rgen.nextInt(0,maxX);
		int y = rgen.nextInt(0,maxY);
		GOval circle = new GOval (x,y,2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
		

	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
