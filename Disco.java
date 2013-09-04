/*
 * File: Disco.java
 * This program creates a window of square
 * tiles of rotating random colors similar
 * to a disco floor.
 * 
 * UPDATE: I haven't figured out how to 
 * get each individual square to continue to 
 * flash.
 *
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class Disco extends GraphicsProgram {
	
	/* Size of the square in pixels. */
	private static final int SIZE = 100;
	/* Duration of the pause in milliseconds. */
	private static final int PAUSE = 1000;
	
	
	public void run() {
		while (y < getHeight()) {
			putRow();
			y = y + SIZE;
		}	
	}
	
	private void putRow() {
		x = 0;
		while (x < getWidth()) {
			putSquare();
			x = x + SIZE;
		}
	}
	
	private void putSquare() {
		GRect square = new GRect(x,y,SIZE,SIZE);
		square.setFilled(true);
		square.setColor(rgen.nextColor());
		add(square);
		
	}
	
	private int x = 1;
	private int y = 1;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
