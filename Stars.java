/* 
 * File: Stars.java
 * ----------------
 * This file is a test file to experiment with the Event-driven
 * programs.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;

/* 
 * This program creates a 5 pointed star 
 * of random size and color each time the user 
 * clicks on the graphics window.
 */

public class Stars extends GraphicsProgram {
	public void init() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		GPolygon heart = GHeart(rgen.nextInt(15,50));
		heart.setFilled(true);
		heart.setColor(rgen.nextColor());
		add(heart, e.getX(), e.getY());
	}
	
	public GPolygon GStar(double size) {
	      double sinTheta = GMath.sinDegrees(18);
	      double b = 0.5 * sinTheta / (1.0 + sinTheta);
	      double edge = (0.5 - b) * size;
	      GPolygon star = new GPolygon();
	      star.addVertex(-size / 2, -b * size);
	      int angle = 0;
	      for (int i = 0; i < 5; i++) {
	         star.addPolarEdge(edge, angle);
	         star.addPolarEdge(edge, angle + 72);
	         angle -= 72;
	      }
	      return star;
	   }
	
	public GPolygon GHeart (int a) {
	double c = Math.sqrt(2 * a * a);
	GPolygon heart = new GPolygon();
	heart.addVertex(0,a);
	heart.addEdge(a,-a);
	heart.addArc(c,c,-45,180);
	heart.addArc(c,c,45,180);
	heart.addEdge(a,a);
	return heart;
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}