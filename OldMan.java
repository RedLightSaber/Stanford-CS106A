/* The Art and Science of Java
 * Chapter 4, Exercise 2
 * ============================
 * This program displays the words to the popular song:
 * "This Old Man".
 */

import acm.program.*;

public class OldMan extends ConsoleProgram {
	public void run() {
		for (int n=1; n<=5; n++) {
			println("This old man, he played "+n);
			switch(n) {
			case 1:
				println("He played knick-knack on my thumb");
				break;
			case 2:
				println("He played knick-knack on my shoe");
				break;
			case 3:
				println("He played knick-knack on my knee");
				break;
			case 4:
				println("He played knick-knack on my door");
				break;
			default:
				println("He played knick-knack on my hive");
				break;
			}
			println("With a knick-knack paddy whack");
			println("Give a dog a bone");
			println("This old man came rolling home");
			println(" ");
			}
	}
}
