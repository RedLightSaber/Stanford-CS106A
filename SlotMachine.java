/* 
 * File: SlotMachine.java
 * 
 * This program recreates a simple slot machine. The user begins
 * with a set amount of money and spins 3 wheels.
 * The balance is automatically deducted and the user is asked if 
 * he/she would like to play again.
 *
 * The Art and Science of Java 
 * Chapter 6, Exercise 5
 */

import acm.program.*;
import acm.util.*;

public class SlotMachine extends ConsoleProgram {
	
/* Sets initial value of the user balance. */
	private static final int START = 50;
	
/* Initiates the random generator. */
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int balance = START;
		int wheel1 = 1;
		int wheel2 = 1;
		int wheel3 = 1;
		String instruct = readLine("Would you like instructions (y/n)?");
		if (instruct.equals("y")) {
			println("Just $1 to play! Pull the handle!");
		}
		while (balance > 0) {
			String play = readLine("You have $"+balance+". Would you like to play(y/n)?");
			if (play.equals("y")) {
				wheel1 = spin();
				wheel2 = spin();
				wheel3 = spin();
				if (wheel1 == 6 && wheel2 == 6 && wheel3 == 6) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- You win $250");
					balance += 249;
				}
				else if (wheel1 == 5 && wheel2 == 5 && (wheel3 == 5 || wheel3 == 6)) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- You win $20");
					balance += 19;
				}
				else if (wheel1 == 4 && wheel2 == 4 && (wheel3 == 4 || wheel3 == 6)) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- You win $14");
					balance += 13;
				}
				else if (wheel1 == 3 && wheel2 == 3 && (wheel3 == 3 || wheel3 == 6)) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- You win $10");
					balance += 9;
				}
				else if (wheel1 == 1 && wheel2 == 1 && wheel3 == 1) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- Three Cherries! You win $7");
					balance += 6;
				}
				else if (wheel1 == 1 && wheel2 == 1) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- You win $5");
					balance += 4;
				}
				else if (wheel1 == 1) {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + "  -- You win $2");
					balance += 1;
				}
				else {
					println(spinToString(wheel1) +"   "+ spinToString(wheel2) +"   "+ spinToString(wheel3) + " -- You lose.");
					balance -= 1;
				}
			}
			else {
				break;
			}
				
						
		}
		
		if (balance > START) {
			println("Yeah, quit while you're ahead! You've scored an extra $"+ (balance - START) +". Come again soon!");
		}
		else {
			println("Thanks for playing! Come again soon!");
		}
			
	}
	
	
	
	/* Spins the wheel and returns a value from 1 to 6 */
	private int spin() {
		int spinValue = rgen.nextInt(1,6);
		return spinValue;
	}

	/* Converts the spin value to a string - with input n being the 
	 * value returned from the spinner. */
	private String spinToString(int n) {
		switch (n) {
			case 1: return ("CHERRY");
			case 2: return ("LEMON");
			case 3: return ("ORANGE");
			case 4: return ("PLUM");
			case 5: return ("BELL");
			case 6: return ("BAR");
			default: return ("ERROR");
		}
	}	
}