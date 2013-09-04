/* File: printConsonants.java
 * --------------------------
 * This file prints a list of English
 * consonants.
 * 
 * The Art and Science of Java - Chapter 8 Exercise 1.
 */

import acm.program.*;
public class printConsonants extends ConsoleProgram {
	
public void run() {
	println("This program prints a list of consonants.");
	for (char ch = 'A'; ch <= 'Z'; ch++) {
		if (isEnglishConsonant(ch)) {
			println(ch);
		}
	}
}

private boolean isEnglishConsonant(char ch) {
	switch(Character.toLowerCase(ch)) {
	case 'a': case 'e': case 'i': case 'o': case 'u': return false;
	default: return true;
	}
}
}
