/* Fibonacci Sequence
 * The Art and Science of Java
 * Chapter 4, Exercise 9.
 * +++++++++++++++++++++++++++
 * This program prints the first 16 values
 * of the Fibonacci sequence. 
 */

import acm.program.*;

public class FibonacciNumbers extends ConsoleProgram {
	
	public void run() {
		println("This program prints the first 16 Fibonacci numbers.");
		println("0");
		println("1");
		int a = 0;
		int b = 1;
		int F = 0;
		for (int n = 3; n<=16; n++ ) {
			F = a + b;
			println(F);
			a = b;
			b = F;
		}
	}
}