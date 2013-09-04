/*
 *File:Target2.java
 *================
 * This file creates a target in the vertial center of the window.
 * The target consists of two red filled circles and a white circle.
 * Exercise 6 on page 54 of The Art and Science of Java.
 * Created by Amanda Neumann 5/09/2013 at 23:14 in bed at Coco Noir.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Target2 extends GraphicsProgram {
	public void run() {
		GOval circle1 = new GOval(200,100,300,300);
		circle1.setColor(Color.RED);
		circle1.setFilled(true);
		add(circle1);
		GOval circle2 = new GOval(250,150,200,200);
		circle2.setColor(Color.WHITE);
		circle2.setFilled(true);
		add(circle2);
		GOval circle3 = new GOval(300,200,100,100);
		circle3.setColor(Color.RED);
		circle3.setFilled(true);
		add(circle3);
	}
}

/* Pretty fucking perfect first go! no bugs... I rock:))
*/
