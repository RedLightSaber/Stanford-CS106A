/*
* File: Exercise2.java
* --------------------
* This program is in response to Exercise 2 on page 53 of The Art and Science of Java.
* This program displays the area of a triangle with base (b) and height (h) as entered by the user.
*/

import acm.program.*;

public class Exercise2 extends ConsoleProgram {
	public void run() {
		println("This program calculates the area of a rectangle");
		double base = readDouble("Enter base length: ");
		double height = readDouble("Enter height: ");
		double area = (base * height) / 2;
		println("The area of your rectangle is = " + area );
			}
}


