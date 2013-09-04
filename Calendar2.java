//Take 2! 

import acm.program.*;
import acm.graphics.*;

import java.awt.*;



public class Calendar2 extends GraphicsProgram {
	private static final int DAYS_IN_MONTH = 31;
	private static final int DAY_MONTH_STARTS = 5;
	private static final int TOP_HEIGHT = 30;
	
	
	public void run() {
		int N_ROWS = 5;
		if (DAY_MONTH_STARTS > 5) {
			N_ROWS = 6;
		}
		// Set rowHeight and columnWidth depending on window size.
		double rowHeight = (getHeight() - TOP_HEIGHT)/N_ROWS;
		double columnWidth = (getWidth() / 7.0);
		int startY = TOP_HEIGHT;
		int date = 2 - DAY_MONTH_STARTS;
		//Set Rows
		for (int i = 0; i < N_ROWS; i++ ) {
			double y = startY + rowHeight * i;
			double labelX = 4;
			GLine line = new GLine (0,y,getWidth(),y);
			add(line);
			
		// set date labels
			for (int j = 0; j < 7; j++ ) {
				if (date > 0 && date <= DAYS_IN_MONTH) {
					GLabel dateLabel = new GLabel (Integer.toString(date));
					dateLabel.setLocation(labelX + j*columnWidth, y + 16);
					add(dateLabel);
				}
				date++;
			}
		}
		
		//Set Columns
		for (int i = 1; i < 7; i++ ) {
			double x = 0 + columnWidth * i;
			GLine line = new GLine (x, startY, x, getHeight());
			add(line);
		}
		
		//Set Top labels
		for (int i = 1; i < 8; i++) {
		String day = "error";
		switch( i ) {
			case 1: 
				day = "SUN";
				break;
			case 2:
				day = "MON";
				break;
			case 3:
				day = "TUES";
				break;
			case 4:
				day = "WED";
				break;
			case 5:
				day = "THUR";
				break;
			case 6:
				day = "FRI";
				break;
			case 7:
				day = "SAT";
				break;
			default:
				day = "error";
				break;
		}
		GLabel label = new GLabel (day);
		double labelWidth = label.getWidth();
		double dx = columnWidth/2 + labelWidth/2;
		label.setLocation(columnWidth * i - dx, TOP_HEIGHT - 4);
		add(label);
		}
	}
}