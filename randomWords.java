/* File: randomWords.java
 * ----------------------
 * This file prints a list of 5 random words.
 * 
 * The Art and Science of Java, Chapter 8, Exercise 2.
 */

import acm.program.*;
import acm.util.*;


public class randomWords extends ConsoleProgram {
	private static final int MIN_LETTERS = 3;
	private static final int MAX_LETTERS = 10;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			println(randomWord());
		}
	}
	private String randomWord() {
		int wordLength = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		String word = "";
		for (int i = 0; i<wordLength; i++) {
			char ch = (char)rgen.nextInt('A','Z');
			word += ch;
		}
		return word;
	}
}


