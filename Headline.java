/* File: Headline.java
 * This program simulates a scrolling news headling
 * by moving a GLabel across the window.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class Headline extends GraphicsProgram {
	private static final String HEADLINE = "IDENTITY OF COCO REVEALED";
	private static final int PAUSE_TIME = 6;
	
	public void run() {
		// Create new GLabel with Headline
		GLabel headline = new GLabel(HEADLINE);
		headline.setFont("Courier-128");
		headline.setColor(Color.BLACK);
	
		//Set starting position
		int startX = getWidth();
		double startY = (getHeight()/2 + headline.getAscent()/2);
		headline.setLocation(startX,startY);
		add(headline);
		
		//Set number of steps
		int steps = (int) (getWidth() + headline.getWidth());
		for (int i = 0; i < steps; i++) {
			headline.move(-1,0);
			pause(PAUSE_TIME);
		}
		
		
	}
		
}