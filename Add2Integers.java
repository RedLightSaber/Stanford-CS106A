/*This program adds three integers as defined by the user and prints their total.
* In response to Exercise 3 from page 53 of The Art and Science of Java.
*/

import acm.program.*;

public class Add2Integers extends ConsoleProgram {
	public void run() {
		println("This program adds three integers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int n3 = readInt("Enter n3: ");
		int total = n1 + n2 + n3;
		println("The total is: " + total + ".");
	}
}

