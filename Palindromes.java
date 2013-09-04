/* File: Palindromes.java
 * ----------------------
 * This file runs a test to see if a word
 * entered by the user is a Palindrome.
 * 
 * The Art and Science of Java, Chapter 8, Exercise 6.
 */

import acm.program.*;

public class Palindromes extends ConsoleProgram {
	public void run() {
		while (true) {
		String str = readLine("Enter a word or phrase: ");
		if (isPalindrome(str)) println("That is a Palindrome!");
		else println("Sorry, try again.");
		}
	}
	
	private boolean isPalindrome(String str) {
		String stringChars = getChars(str);
		int length = stringChars.length();
		for (int i = 0; i < length; i++) {
			if (stringChars.charAt(i) != stringChars.charAt(length - 1 - i)) return false;			
		}
		return true;
	}
	private String getChars(String str) {
		String lowerCase = str.toLowerCase();
		String newString = "";
		for (int i = 0; i < lowerCase.length(); i++) {
			char ch = lowerCase.charAt(i);
			if (Character.isLetter(ch)) newString += ch;
		}
		return newString;	
	}
}