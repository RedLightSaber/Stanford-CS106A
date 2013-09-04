/* "Why is everything either at sixes or sevens?"
 * Gilbert and sullivan, H.M.S.Pinafore, 1878.
 * +++++++++++++++++++++++++++++++++++++++++++++
 * This program displays the integers betwen 1 to 100 that are divisible
 * by either 6 or 7 but not both.
 */

import acm.program.*;

public class SixesOrSevens extends ConsoleProgram {
	public void run() {
		for (int n = 1; n<101; n++) {
			if (((n % 6 == 0) || (n%7==0)) && !((n%6==0) && (n%7==0))) {
				println(n);
			}
		}
	}
}