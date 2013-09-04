/* File: Language.java
 * 
 * This program provides a random answer to the question:
 * Which language should I learn today?
 */

import acm.program.*;
import acm.util.*;

import java.applet.AudioClip;
import java.awt.*;

import acm.graphics.*;

public class Language extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private AudioClip pacmanClip = MediaTools.loadAudioClip("pacman.au");
	private static final Font headingFont = new Font("Arial",Font.BOLD,16);
	private static final Font languageFont = new Font("COURIER",Font.BOLD,24);

	public void run() {
		setup();
		while (true) {
			waitForClick();
			GObject object = getElementAt(150,200);
			if (object != null) {
				remove(object);
			}
			pacmanClip.play();
			pause(4000);
			GLabel language = new GLabel(randomLanguage());
			language.setFont(languageFont);
			language.setColor(rgen.nextColor());
			add(language,150,200);
		}	
	}
	private void setup() {
		setBackground(Color.BLACK);
		GLabel heading = new GLabel("Which program should I learn today?");
		heading.setFont(headingFont);
		heading.setColor(Color.WHITE);
		add(heading,100,100);
	}
	private String randomLanguage() {
		int spinValue = rgen.nextInt(1,6);
		switch (spinValue) {
		case 1: return "Java Baby!";
		case 2: return"JQuery!";
		case 3: return "Javascript!";
		case 4: return "iOS!";
		case 5: return "Ruby Ruby Ruby!";
		case 6: return "Ruby on Rails";
		default: return "error - take a break!";
		}
		
	}
}