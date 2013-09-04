/* 
* File: basicgraphics.java
* ------------------------
* This program has been created to practice the exercises set out in 
* 'The art and science of Java' chapter 2.6 - Graphics Programs.
* This program will display 'I love Java' on the screen with the starting
* location of 100,50. The programmer's name and signature are also displayed'
* on the screen at location 500,500.
*/

/* Exercise 1
 * 
 */

import java.awt.*;
import acm.program.*;
import acm.graphics.*;

public class basicgraphics extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("I love Java",100,50);
		label.setColor(Color.RED);
		label.setFont("Helvetica-24");
		add(label);
		GRect border = new GRect(500,500,80,30);
		border.setColor(Color.BLUE);
		add(border);
		GLabel signature = new GLabel("Created by Amanda Neumann", 550,480);
		add(signature);
	}
	
}

