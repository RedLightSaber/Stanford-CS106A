/*
 * File: MyHouse.java
 * ------------------
 * This program draws a cute little house with a red roof and a red door
 * in the centre of the window.
 * Exercise 4 from page 54 of The Art and Science of Java.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class MyHouse extends GraphicsProgram {
	public void run() {
		GRect house = new GRect(200,200,300,200);
		add(house);
		GLine roof1 = new GLine(200,200,350,100);
		roof1.setColor(Color.RED);
		add(roof1);
		GLine roof2 = new GLine(350,100,500,200);
		roof2.setColor(Color.RED);
		add(roof2);
		GRect window1 = new GRect(220,220,80,80);
		add(window1);
		GRect window2 = new GRect(400,220,80,80);
		add(window2);
		GRect door = new GRect(320,260,60,140);
		door.setColor(Color.RED);
		add(door);
		GOval handle = new GOval(360,330,10,10);
		add(handle);
	}
}
