/* File = BackwardsNumber.java
 * 'The Art and Science of Java' Chapter 4, Exercise 6.
 * ====================================================
 * This program takes any given integer (n) and reverses the order
 * of the digits. 
 */

import acm.program.*;

public class BackwardsNumber extends ConsoleProgram {
	public void run() {
		int x = 1;
		int v = 0;
		int n = readInt("Please enter any positive integer: ");
		int b = 0;
		while ((n/x) != 0) {
			x = x*10;
			b = ( n % x )/( x / 10);
			v = ( v * 10) + b;
		}
		println("Your reversed value is: " + v );
	}
}