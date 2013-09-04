/* This file removes
 * Double letters from a word entered in the console.
 * As an added test - can I write it in 3 minutes?
 */

import acm.program.*;

public class RemoveDoubles extends ConsoleProgram {
	public void run() {
		while(true) {
			String word = readLine("Enter a word: ");
			println(removeDbl(word));
	}
	}
	private String removeDbl(String word) {
		String newWord = "";
		newWord += word.charAt(0);
		for (int i = 1; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(i - 1)) {
				newWord += word.charAt(i);
			}
		}
		return newWord;
	}
}
 