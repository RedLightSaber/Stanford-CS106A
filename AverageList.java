/* The Art and Science of Java - Chapter 4, Exercise 5.
 * ====================================================
 * This program reads in a list of integers and then prints
 * out the average.
 * Uses -1 as a sentinal to indicate the end of the list.
 */

import acm.program.*;

public class AverageList extends ConsoleProgram {
	
	private static final int SENTINAL = -1;
	
	public void run() {
		println("This program gives an average for a list of numbers.");
		println("When you have finished entering your list, use -1");
		println("as your sentinal to signal you have finished.");
		double total = 0;
		int count = 0;
		int value = readInt("?");
		while (value != SENTINAL) {
			count ++;
			total += value;
			value = readInt("?");
		}
		println("The average value is "+total/count);
	}
}