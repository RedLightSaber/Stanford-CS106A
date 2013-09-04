/* 
 * This program sings the song '99 Bottles of Beer'
 * The Art and Science of Java - Chapter 4
 * Programming Exercise 1. 
 */

import acm.program.*;

public class BottlesOfBeer extends ConsoleProgram {
	
	private static final int START = 99;
	
	public void run() {
		for (int i = START; i > 0; i--) {
			println(i +" bottles of beer on the wall.");
			println(i +" bottles of beer.");
			println("You take one down, pass it around.");
			println(i +" bottles of beer on the wall.");
		}
		println("There are no more bottles of beer on the wall!!");
	}
	
}