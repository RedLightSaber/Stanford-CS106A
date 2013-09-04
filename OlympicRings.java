/* File OlympicRings.java
 * ---------------------
 * Created by Amanda Neumann 09/05/13
 *
 * Draws 5 interlocking Olympic rings in the colors blue, yellow, black, green and red. 
 * Exercise 7 from page 55 of The Art and Science of Java.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class OlympicRings extends GraphicsProgram {
	public void run() {
		for (int i=0; i < 3; i++) {
		GOval blue = new GOval(250+i,50+i,80-2*i,80-2*i);
		blue.setColor(Color.BLUE);
		add(blue);
		GOval yellow = new GOval(300+i,100+i,80-2*i,80-2*i);
		yellow.setColor(Color.YELLOW);
		add(yellow);
		GOval black = new GOval(350+i,50+i,80-2*i,80-2*i);
		black.setColor(Color.BLACK);
		add(black);
		GOval green = new GOval(400+i,100+i,80-2*i,80-2*i);
		green.setColor(Color.GREEN);
		add(green);
		GOval red = new GOval(450+i,50+i,80-2*i,80-2*i);
		red.setColor(Color.RED);
		add(red);
		}
	}
}