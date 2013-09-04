/* This program counts how many coin flips
 * it takes to reach a total of 3 consecutive
 * heads.
 *
 * The Art and Science of Java
 * Chapter 6 - Exercise 2
 */

import acm.program.*;
import acm.util.*;

public class CoinFlip extends ConsoleProgram {
	public void run() {
		int tailsCount = 0;
		int headsCount = 0;
		int total = 0;
		while (headsCount < 3) {
			int n = flipCoin();
			total++;
			if  (n == 0) {
				println("Tails");
				tailsCount++;
				headsCount = 0;
			} 
			else if (n == 1) {
				println("Heads");
				headsCount++;
				tailsCount = 0;				
			} else {
				println("Error");				
			}
		}
		println("It took " + total + " flips to get 3 consecutive heads.");			
		}
	
	private int flipCoin() {
		int flip = rgen.nextInt(0,1);
		return flip;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}