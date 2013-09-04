/* This program displays a randomly chosen card from 
 * a standard deck.
 * 
 * The Art and Science of Java
 * Chapter 6 Exercise 1
 */

import acm.program.*;
import acm.util.*;

public class RandomGen extends ConsoleProgram {
	public void run() {
		println("This program shuffles the magic deck!");
		String rank = getRank();
		String suit = getSuit();
		println("Your card is: " + rank + " of " + suit + ".");
	}
	
	private String getRank() {
		int value = getRandomInt(12);
		switch (value) {
			case 0:
				return "Ace";
			case 1:
				return "Two";
			case 2:
				return "Three";
			case 3:
				return "Four";
			case 4: 
				return "Five";
			case 5:
				return "Six";
			case 6:
				return "Seven";
			case 7:
				return "Eight";
			case 8:
				return "Nine";
			case 9:
				return "Ten";
			case 10: 
				return "Jack";
			case 11:
				return "Queen";
			case 12: 
				return "King";
			default:
				return "Infinite Loop";
		}
	}
	private String getSuit() {
		int value = getRandomInt(3);
		switch (value) {
		case 0: return "Clubs";
		case 1: return "Spades";
		case 2: return "Hearts";
		case 3: return "Diamonds";
		default: return "Chocolate";
		}
	}
	

	private int getRandomInt(int n) {
		int value = rgen.nextInt(0, n);
		return value;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
		
}
