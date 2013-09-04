/* File: WordGame.java
 * ===================
 * This file reads a word from the console and returns
 * a score based on a set of common character values.
 * 
 * The Art and Science of Java, Chapter 8, Exercise 5
 */

import acm.program.*;

public class WordGame extends ConsoleProgram {
	public void run() {
		while (true) {
			String word = readLine("Enter a word: ");
			if (word.equals(" ")) break;
			println("Your word score is: "+ wordScore(word));
		}
		
	}
	
	private int wordScore(String word) {
		int score = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			switch (ch) {
			case 'A': case 'E': case 'I': case 'L': case 'N': 
				case 'O': case 'R': case 'S': case 'T': case 'U': score += 1; break;
				case 'D': case 'G': score += 2; break;
				case 'B': case 'C': case 'M': case 'P': score += 3; break;
				case 'F': case 'H': case 'V': case 'W': case 'Y': score += 4; break;
				case 'K': score += 5; break;
				case 'J': case 'X': score += 8; break;
				case 'Q': case 'Z': score += 10; break;
				default: break;
			}
		}
		return score;
		
	}
}
