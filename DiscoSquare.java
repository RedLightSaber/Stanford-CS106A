//Forget comments - I don't have time!

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;



public class DiscoSquare extends GraphicsProgram {
	private static final int EDGE = 200;
	
	public void run() {
	GRect square = new GRect ((getWidth()/2)-EDGE/2,(getHeight()/2)-EDGE/2,EDGE,EDGE);
	square.setFilled(true);
	square.setColor(Color.BLACK);
	add(square);
	while (true) {
		square.setColor(rgen.nextColor());
		pause(350);
	}
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

