/* File: Commas.java
 * This file adds commas to a number to represent place value.
 * CS106A - Problem Set 4, Question 1
 */


import acm.program.*;


public class Commas extends ConsoleProgram {
	public void run() {
		println("This program will add commas to any number.");
		while (true) {
			String number = readLine("Enter a number: ");
			if (number.length() == 0) break;
			println(addCommasToNumericString(number));
		}
	}
	private String addCommasToNumericString(String number) {
		String newString = "";
		for (int i = 0; i < number.length(); i++) {
			if (((number.length() - i) % 3 == 0) && number.length() > 3)  {
				newString += ",";
			}
			newString += number.charAt(i);
		}
	return newString;
	}
	
}
 