/* File: CapitalizeMe.java
 * =======================
 * This file capitalizes all 
 * names I am currently known by.
 *
 * The Art and Science of Java, Chapter 8, Exercise 3.
 */

import acm.program.*;

public class CapitalizeMe extends ConsoleProgram {
	public void run() {
		println(capitalize("amanda"));
		println(capitalize("MUMMY"));
		println(capitalize("msWild"));
		println(capitalize("littlered"));
		println(capitalize("whoiscoco"));
	}
	private String capitalize(String str) {
		String lowerCaseString = str.toLowerCase();
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = lowerCaseString.charAt(i);
			if (!Character.isLetter(ch)) {
				newString += ch;
			} else if (i == 0) {
				newString += Character.toUpperCase(ch);
			} else {
				newString += ch;
			}
		}
		return newString;
	}
}