/*  The Art and Science of Java - Chapter 5.
 *  This program prints a list of values 1 to 10
 * for any given value of k and n.
 */

import acm.program.*;

public class raiseIntToPower extends ConsoleProgram {
	public void run() {
		for (int i = 0; i < 11 ; i++) {
			println(2 + " to the power of " + i + " = " + intToPower(2,i));
		}
		
	}
	
	private int intToPower (int n, int k) {
		if (k==0) return 0;
		int v = 1;
		for (int i = 0; i < k; i++) {
			v = v * n;
		}
		return v;
	}
}
