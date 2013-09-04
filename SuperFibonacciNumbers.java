/* Fibonacci Sequence - Extended
 * The Art and Science of Java
 * Chapter 4, Exercise 10.
 * +++++++++++++++++++++++++++
 * This program prints all values
 * of the Fibonacci sequence that are less than 10,000. 
 */

import acm.program.*;

public class SuperFibonacciNumbers extends ConsoleProgram {
	
	public void run() {
		println("This program prints all the Fibonacci numbers below 10,000.");
		println("0");
		println("1");
		int a = 0;
		int b = 1;
		int F = 0;
		while (F<=10000) {
			F = a + b;
			if (F<10000) println(F);
			a = b;
			b = F;
		}
	}
}