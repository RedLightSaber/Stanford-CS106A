/* This program returns the sum of odd numbers up to a given
 * value 'N'.
 * ========================================================
 * The Art and Science of Java - Chapter 4, Exercise 3
 */

import acm.program.*;

public class SumOddInt extends ConsoleProgram {
	public void run() {
		int N = readInt("Enter a positive integer: ");
		int T = 0;
		for (int x = 1; x <= (N*2); x++ ) {
			if (x % 2 != 0) {
				println(x);
				T = T + x;
			}
		}
		println("The sum is "+T);
	}
}