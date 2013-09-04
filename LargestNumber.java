/* Largets Number Program
 * The Art and Science of Java
 * Chapter 4 Exercise 12.
 * ===========================
 * This program displays the largest value
 * from a list of values entered by the user.
 * A sentinal is used to signal the end of the number 
 * sequence.
 */

import acm.program.*;

public class LargestNumber extends ConsoleProgram {
	private static final int SENTINAL = 0;
	
	public void run() {
		int n = 1;
		int highestValue = 0;
		while (n != SENTINAL) {
			n = readInt("Enter number: ");
			if (n>= highestValue) {
				highestValue = n;
			}
		}
		println("The highest value is: " + highestValue);
	}
}