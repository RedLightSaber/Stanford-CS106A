/* This program simulates the decay of a given number
 * of atoms year by year.
 *
 * The Art and Science of Java
 * Chapter 6, Exercise 4.
 */

import acm.program.*;
import acm.util.*;

public class HalfLife extends ConsoleProgram {
	public void run() {
		int t = START;
		int y = 0;
		println("There are " + START + " atoms initially.");
		while (t > 0) {
			int n = 0;
			for (int i=1; i < t; i++) {
				n = n + decay();
			}
			t = n;
			y++;
			println("There are " + n + " atoms at the end of year " + y);
		}	

	}
	
	private int decay() {
		int value = rgen.nextInt(0, 1);
		return value;
	}
	
	private static final int START = 10000;	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}