/* The Art and Science of Java - Chapter 4 Solutions
 * Exercise 8.
 * Rewrite the countdown program shown in Figure 4-8
 * using a while loop instead of for.
 */
 
 import acm.program.*;
 
 public class Liftoff extends ConsoleProgram {
	 
	 private static final int START = 100;
	 
	 public void run() {
		 int t = START;
		 while (t >= 0) {
			 println(t);
			 t-=1;
		 }
		 println("Liftoff!");
		 }
 }
 