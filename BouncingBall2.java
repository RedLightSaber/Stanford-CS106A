/* 
 * File: BouncingBall.java
 * -----------------------
 * This program graphically simulates a bouncing ball.
 */

import java.awt.Color;
import acm.program.*;
import acm.graphics.*;

public class BouncingBall2 extends GraphicsProgram {
	/** Size (diameter) of the ball */
	private static final int DIAM_BALL = 30;
	
	/** Amount Y velocity is increased each cycle as a 
	 * result of gravity. */
	private static final double GRAVITY = 3;
	
	/** Animation delay or pause time between ball moves */
	private static final int DELAY = 30;
	
	/** Initial X and Y location of ball */
	private static final double X_START = DIAM_BALL/2;
	private static final double Y_START = 100;

	/** X Velocity */
	private static final double X_VEL = 5;
	
	/**Amount Y velocity is reduced when it bounces */
	private static final double BOUNCE_REDUCE = 0.9;
	
	/**Starting X and Y Velocities */
	private double xVel = X_VEL;
	private double yVel = 0.0;
	
	/* private instance variable */
	private GOval ball;
	
	public void run() {
		setup();
		
		//simulation ends when ball goes off far right hand wall.
		while (ball.getX() < getWidth()) {
			moveBall();
			checkForCollision();
			pause(DELAY);
		}
	}
	
	/** Create and place ball */
	private void setup() {
		ball = new GOval(X_START, Y_START, DIAM_BALL, DIAM_BALL);
		ball.setFilled(true);
		ball.setColor(Color.GREEN);
		add(ball);
	}
	
	/** Update and move ball */
	private void moveBall() {
		//increase yVelocity due to gravity on each cycle
		yVel += GRAVITY;
		ball.move(xVel,yVel);
	}
	
	private void checkForCollision() {
		if (ball.getY() > getHeight() - DIAM_BALL) {
			yVel = -yVel * BOUNCE_REDUCE;
			double diff = ball.getY() - (getHeight() - DIAM_BALL);
			ball.move(0, -2 * diff);
		}
	}
}