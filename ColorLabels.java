
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;

public class ColorLabels extends GraphicsProgram {
	public void run() {
		add(colorLabel("RED"));
		add(colorLabel("YELLOW"));
		add(colorLabel("ORANGE"));
		add(colorLabel("GREEN"));
		add(colorLabel("CYAN"));
		add(colorLabel("BLUE"));
		add(colorLabel("MAGENTA"));
	}

private GLabel colorLabel (String str) {
	GLabel label = new GLabel(str);
	label.setFont("Courier-72");
	label.setColor(rgen.nextColor());
	while (label.getColor().toString() == str) {
		label.setColor(rgen.nextColor());
	}
	double w = label.getWidth();
	double h = label.getHeight();
	label.setLocation(rgen.nextDouble(0,getWidth() - w),rgen.nextDouble(0+h,getHeight() - h));
	return(label);
}
private RandomGenerator rgen = RandomGenerator.getInstance();

}