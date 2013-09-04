/* 
 * File: HitchhikerButton.java
 * ---------------------------
 * This file recreates the hitchhiker
 * button example from page 364 of The Art
 * And Science of Java.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class HitchhikerButton extends ConsoleProgram {
	public void init() {
		add(new JButton("Red"), SOUTH);
		add(new JButton("Green"), SOUTH);
		add(new JButton("Red"),SOUTH);
		addActionListeners();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Red")) {
			println("Please do not press this button again.");
		}
		if (e.getActionCommand().equals("Green")) {
			println("This button does absolutely nothing.");
		}
	}
}