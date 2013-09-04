/* File Plurals.java
 * -----------------
 * This file converts a word
 * entered by the user into it's
 * plural form.
 * 
 * The Art and Science of Java, Chapter 8, Exercise 8
 */

import acm.program.*;

public class Plurals extends ConsoleProgram {
	public void run() {
		while(true) {
			String word = readLine("Enter a singular word: ");
			println("The plural of "+ word + " is " + createRegularPlural(word));		
	
		}
	}
	private String createRegularPlural (String word) {
		String lowerCaseWord = word.toLowerCase();
		String newWord = "";
		int end = lowerCaseWord.length()-1;
		char ch = lowerCaseWord.charAt(end);
		char ch2 = lowerCaseWord.charAt(end-1);
		if ((ch == 's') || (ch == 'x') || (ch == 'z') || 
				((ch == 'h') && ((ch2 == 'c') || 
						(ch2 == 's')))) newWord = lowerCaseWord + "es";
		else if ((ch == 'y') && (isConsonant(ch2))) newWord = lowerCaseWord.substring(0,end) + "ies";
		else newWord = lowerCaseWord + "s";
		return newWord;
	}
	
	private boolean isConsonant(char ch) {
		switch(ch) {
		case 'a': case 'e': case 'i': case 'o': case 'u': return false;
		default: return true;
		}
	}
}