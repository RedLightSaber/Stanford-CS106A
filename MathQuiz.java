/* 
 * File: MathQuiz.java
 *
 * This program creates a simple Math quiz using 
 * only addition and subtraction and leveled so 
 * that no value including the answers will be
 * outside of the range 0-20.
 * 
 * I added in an extra feature of calculating the 
 * total score which is displayed at the end of the quiz.
 *
 * The Art and Science of Java - Chapter 6, Exercise 6.
 *
 */

import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {
	public void run() {
		int score = 0;
		for (int i = 0; i < QUESTIONS; i++) {
		score = score + askQuestion();
		}
	println("Thanks for completing the quiz. You scored "+ score + "/" + QUESTIONS +".");
	}
	
	private int askQuestion() {
		int a = randomInt(0,20);
		int b = 1;
		int operator = randomInt(0,1);
		int answer = 1;
		
		if (operator == 1) {
			b = randomInt(0,(20-a));
			answer = a + b;
		} else {
			b = randomInt(0,a);
			answer = a - b;
		}
		// Get response 
		int response = readInt("What is " + a + " " + operatorToString(operator) + " " + b + "? ");
		int count = 1;
		// Evaluate answer
		// Do while incorrect (up to 3 attempts).
		while ((response != answer) && (count < 3)) {
			response = readInt("Incorrect. Try again: ");
			count++;
		}
		if (response == answer) {
			//println("Well done. That's correct."); - removed for modification below
			println(supify(randomInt(1,6)));
			return 1;
		}
		else {
			println("Incorrect. The correct answer is "+ answer +".");
			return 0;
		}		
	}
	/* Sets the operator using a random 1 or 0,
	 * where 0 = minus and 1 = plus.
	 */
	private String operatorToString(int i) {
		if (i == 0) {
			return ("-");
		}
		else {
			return ("+");
		}
	}
	
	private String supify(int n) {
		switch (n) {
		case 1: return "You Rock!";
		case 2: return "Splendid, Darling!";
		case 3: return "Is your name Einstein?";
		case 4: return "Who died and made you Math genius?";
		default: return "Well done!";
		}
	}
	private int randomInt(int l, int h) {
		int value = rgen.nextInt(l, h);
		return value;
	}
	
private static final int QUESTIONS = 10;
private RandomGenerator rgen = RandomGenerator.getInstance();
}