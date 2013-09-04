/* Count digits problem.
  * THe Art and Science of Java - Chapter 5
  * Exercise 4.
  * This program counts the number of digits in a 
  * given positive integer.
  */

import acm.program.*;

public class countDigitsProgram extends ConsoleProgram {
	public void run() {
		int n = readInt("Please enter a positive integer: ");
		int t = countDigits(n);
		println("The number "+ n + " has " + t + " digits.");
	}
	
	private int countDigits(int x) {
		int t = 0;
		int v = x;
		while (v != 0) {
			v = v / 10;
			t++;
		}
		return t;
	}
}
