/*
 * Test file CountDown.java
 * Purpose = getting me back in the game - remembering how to write a program.
 * A response to Q.11 on the Chapter 4 review questions.
 * ==========================================================================
 * This program counts forwards by 7s starting at 0 until the number has more
 * than two digits.
 */
 
 import acm.program.*;
 
 public class CountDown extends ConsoleProgram {
 	public void run() {
 		for (int i=100; i>=0; i-=2) {
 			println(i);
 		}
 	}
 }
 	