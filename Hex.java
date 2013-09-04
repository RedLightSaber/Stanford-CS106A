/* 
 * File: Hex.java
 * This program converts a hexadecimal value to a 
 * decimal equivalent.
 *
 * The Art and Science of Java, Chapter 7 Exercise 1.
 */

import acm.program.*;

public class Hex extends ConsoleProgram {
		public void run() {
		println("This program converts hexadecimal values to decimals.");
		println("Enter 0 to stop");
		String hex = "";
		while(true) {
			hex = readLine("Enter a hexadecimal number: ");
			if (hex.equals("0")) break;
			int dec = Integer.parseInt(hex,16);
			println(hex + " hex = "+ dec + " decimal.");
		}
	}
}
