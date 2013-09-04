/* File: Calendar.java
 * 
 * The Art and Science of Java - Chapter 9, Exercise 9.
 * --------------------------------------------------------
 * This program draws a simple calendar. The number of rows
 * are adjusted according to the start date of the month.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Calendar extends GraphicsProgram {

	/* sets month starting day and number of days */
	private static final int DAYS_IN_MONTH = 31;
	private static final int DAY_MONTH_STARTS = 5;
	
	/* sets font size and padding */
	private static final int FONT_SIZE = 16;
	private static final int PADDING = 4;
	
	public void run() {
		setTop();
		boxWidth = 100;
		GRect test = new GRect (boxWidth,100,200,200);
		add(test);
		if (DAY_MONTH_STARTS > 4) {
			N_Rows = 6;
		}
		for (int i = 1; i < N_Rows; i++) {
			y = i * rowHeight + topHeight;
			setRow();			
		}
		
	}
	
	private void setTop() {
		y = PADDING + FONT_SIZE;
		for (int i = 0; i < 7; i++) {
			GLabel label = new GLabel(getDay(i));
			double labelW = label.getWidth();
			double labelX = (getWidth() / 7) * i;
			label.setLocation(labelX,y);
			label.setFont("Arial");
			add(label);
		}
	}
	
	private String getDay(int value) {
		switch (value) {
		case 0: return"SUN";
		case 1: return "MON";
		case 2: return "YA MUM!";
		case 3: return "WED";
		case 4: return "THUR";
		case 5: return "FRI";
		case 6: return "SAT";
		default: return "ERROR!";
		}
		
	}
	private void setRow() {
		for (int i = 0; i < 7; i++) {
			double x = getWidth() * i;
			GRect square = new GRect (x, y , boxWidth, rowHeight );
			add(square);
			if (date > 0 && date <= DAYS_IN_MONTH) {
				GLabel label = new GLabel (Integer.toString(date));
				label.setFont("Courier-" + FONT_SIZE);
				label.setLocation(x + PADDING, y + label.getAscent() + PADDING);
				add(label);
			}
			date++;
			
		}
	}
	/* instance variables */
	int N_Rows = 5;
	int topHeight = FONT_SIZE + PADDING * 2;
	double y = 0;
	double x = 0;
	double rowHeight = 50;
		//(getHeight() - topHeight)/N_Rows;
	double boxWidth = 80;
	// need to work out why this won't set to getWidth / 7.
	int date = 1 - DAY_MONTH_STARTS;
}
 