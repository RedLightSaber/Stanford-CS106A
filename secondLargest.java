/* This file reads a set of integers and calculates
 * The largest and second largest.
 */

import acm.program.*;

public class secondLargest extends ConsoleProgram{
	public void run() {
		int value = 1;
		int largest = 0;
		int secondLargest = 0;
		
		println("This program finds the two largest integers in a list. Enter numbers one line" +
				"at a time. Enter a 0 to signal the end of the list.");
		while (true) {
			value = readInt("?");
			if (value == 0) break;
			if (value > largest) {
				largest = value;
			} else if (value > secondLargest) {
				secondLargest = value;
			}
		}
		println("The largest value is: "+ largest);
		println("the second largest value is: " + secondLargest);
		println("You rock this exam!");
	}
}