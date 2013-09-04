/* File: Checkerboard.java
 * This program draws a checkerboard.  It then places 
 * counters on the checkerboard corresponding to the start
 * of the game.
 * The Art and Science of Java - Chapter 4, Exercise 14.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	
	public void run() {
		double sqSize = (double) getHeight() / N_ROWS;
		double startX = ((double) getWidth() - (N_COLUMNS*sqSize))/2;
		
		for (int i = 0; i< N_ROWS; i++) {
			for (int j= 0; j < N_COLUMNS; j++) {
				double x = j * sqSize + startX;
				double y = i * sqSize;
				GRect sq = new GRect (x,y,sqSize, sqSize);
				sq.setFilled((i + j) % 2 !=0);
				sq.setFillColor(Color.GRAY);
				add(sq);
			}
		}
		for (int i = 0; i< 3; i++) {
			for (int j=0; j < N_COLUMNS; j++) {
				double x = j * sqSize + startX;
				double y = i * sqSize;
				if ((i+j) %2 !=0) {
					GOval counter = new GOval (x,y,sqSize,sqSize);
					counter.setColor(Color.WHITE);
					counter.setFilled(true);
					counter.setFillColor(Color.RED);
					add(counter);
				}
			}
		}
		for (int i = N_ROWS; i>(N_ROWS-4); i--) {
			for (int j=0; j < N_COLUMNS; j++) {
				double x = j * sqSize + startX;
				double y = i * sqSize;
				if ((i+j) %2 !=0) {
					GOval counter = new GOval (x,y,sqSize,sqSize);
					counter.setColor(Color.WHITE);
					counter.setFilled(true);
					counter.setFillColor(Color.BLACK);
					add(counter);
				}
			}
		}
	}
}