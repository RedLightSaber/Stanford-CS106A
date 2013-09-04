/* File: Rational.java
 * This file allocates 1000 Rational objects in order to test the
 * garbage collection.
 * 
 * The Art and Science of Java - Chapter 7 Exercise 4.
 */

import acm.program.*;

public class Rational extends ConsoleProgram {
	private static int totalRational = 50000;
	
	public void run() {
		Runtime myRuntime = Runtime.getRuntime();
		long startValue = myRuntime.freeMemory();
		println("initial value: " + startValue);
		println("Allocating " + totalRational + " Rational objects.");
		for (int i = 0; i < totalRational; i++) {
			new Rational();
		}
		println("For loop complete!");
		long endValue = myRuntime.freeMemory();
		println("new runtime: " + endValue);
		println("Clearning garbage now!");
		myRuntime.gc();
		println("Garbage collected! Memory freed: " + (myRuntime.freeMemory()-endValue));
	}
}