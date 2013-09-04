/*
 * File: Pacman.java
 * -----------------
 * This program creates a pacman figure
 * using a GArc which moves across the 
 * graphics window from left to right.
 * 
 * The Art and Science Of Java: Chapter 9, Exercise 12
 */

import acm.program.*;
import acm.util.MediaTools;
import acm.graphics.*;
import java.awt.*;
import java.applet.*;

public class Pacman extends GraphicsProgram {
	
	private static final double PAUSE = 250;
	private static final double RADIUS = 50;
	
	public void run() {
		/* Instance variables for arc and location */
		double x = 0;
		double y = getHeight();		
		
		/* Sets the initial pacman figure */
		GArc pacman = new GArc (RADIUS * 2,RADIUS * 2, 45, 270);
		pacman.setFilled(true);
		pacman.setFillColor(Color.YELLOW);
		add(pacman,x,y-pacman.getHeight());
		setBackground(Color.BLACK);
		waitForClick();
		pacmanClip.play();
		/*Creates the animation */
		while (true) {
			for (int i = 1; i < 7; i++) {
				pacman.move(RADIUS, 0);
				if (i == 1 || i == 5) {
					pacman.setStartAngle(20);
					pacman.setSweepAngle(320);
				}
				if (i == 2 || i == 6) {
					pacman.setStartAngle(10);
					pacman.setSweepAngle(340);
				}
				if (i == 3) {
					pacman.setStartAngle(0);
					pacman.setSweepAngle(360);
				}
				if (i == 6) {
					pacman.setStartAngle(45);
					pacman.setSweepAngle(270);
				}
				pause(PAUSE);
				if (pacman.getX() > getWidth()) pacman.setLocation(0,y-pacman.getHeight());
			}
			
		}
	}
	private AudioClip pacmanClip = MediaTools.loadAudioClip("pacman.au");
	
}