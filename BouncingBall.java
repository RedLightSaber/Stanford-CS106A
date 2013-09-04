/* This program bounces a ball around the window.
 * The Art and Science of Java - Chapter 4, Exercise 15.
 * Extends the Animated Square program from Figure 4-10.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {
	
	private static final int SIZE = 50;
	private static final int PAUSE_TIME = 2;
	
	public void run() {
		double centerX = (getWidth()/2)-(SIZE/2);
		double centerY = (getHeight()/2)-(SIZE/2);
		GOval ball = new GOval (centerX,centerY,SIZE,SIZE);
		ball.setFilled(true);
		ball.setColor(Color.MAGENTA);
		add(ball);
		
		//sets initial dx and dy values to 1.
		int dx = 1;
		int dy = 1;
		
		//bounce ball
		while (true) {
			ball.move(dx,dy);
			pause(PAUSE_TIME);
			double x = ball.getX();
			double y = ball.getY();
		//Tests location of x and y to change direction
		//when it hits a wall.
			if (x >= getWidth()-SIZE) {
				dx=-dx;
			}
			if (y>= getHeight()-SIZE) {
				dy=-dy;
			}
			if (x==0) {
				dx=-dx;
			}
			if (y==0) {
				dy=-dy;
			}
			} // end while
		} // end run
} //end class

