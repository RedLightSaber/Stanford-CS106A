/* File = DigitalRoot.java
 * The Art and Science of Java Chapter 4, Exercise 7
 * ==================================================
 * This program returns the digital root of any given value.
 */
 
 import acm.program.*;
 
 public class DigitalRoot extends ConsoleProgram {
	 public void run() {
		 int n = readInt("Enter a positive integer: ");
		 int v = 0;
		 int dsum = 0;
		 while (n > 9) {
			while (n>0) {
				dsum = (n%10);
				n = n/10;
				v = v + dsum;
		 	} /*End While */
			dsum = 0;
			n = v;
			v = 0;
	 	} /* End While */
	 	println("The digital root is "+n);
 } /* End run */
 } /* End class */