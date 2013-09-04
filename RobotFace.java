/*
* File:RobotFace.java
* ===================
* This program draws a gray robot face in the center of the window with orange eyes,
* a black nose and white mouth.
* Exercise 5, page 54 of The Art and Science of Java. 
* Created by Amanda Neumann 5/05/2009 in my bed at Coco Noir.
*/

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	public void run() {
		GRect face = new GRect(200,50,200,400);
		face.setColor(Color.BLACK);
		face.setFilled(true);
		face.setFillColor(Color.GRAY);
		add(face);
		GOval eye1 = new GOval(250,100,20,20);
		eye1.setColor(Color.ORANGE);
		eye1.setFilled(true);
		add(eye1);
		GOval eye2 = new GOval(330,100,20,20);
		eye2.setFilled(true);
		eye2.setColor(Color.ORANGE);
		add(eye2);
		GRect nose = new GRect(295,200,10,40);
		nose.setFilled(true);
		nose.setColor(Color.BLACK);
		add(nose);
		GRect mouth = new GRect(250,350,100,50);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);
	}
}