/*
 * File: SuperShapes.java
 * ----------------------
 * This program draws random shapes on
 * the graphics window wherever the mouse is clicked.
 */

import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import acm.graphics.*;
import acm.util.*;

public class SuperShapes extends GraphicsProgram {
	public void init() {
		add(new JButton("Clear"), SOUTH);
		//fillCheckbox = new JCheckBox("Filled");
		//fillCheckbox.setSelected(true);
		//add(fillCheckbox,SOUTH);
		squareButton = new JRadioButton("square");
		heartButton = new JRadioButton("heart");
		triangleButton = new JRadioButton("triangle");
		starButton = new JRadioButton("star");
		randomButton = new JRadioButton("random");
		ButtonGroup shapeGroup = new ButtonGroup();
		shapeGroup.add(squareButton);
		shapeGroup.add(heartButton);
		shapeGroup.add(triangleButton);
		shapeGroup.add(starButton);
		shapeGroup.add(randomButton);
		starButton.setSelected(true);
		add(starButton,SOUTH);
		add(heartButton,SOUTH);
		add(triangleButton,SOUTH);
		add(squareButton,SOUTH);
		add(randomButton,SOUTH);
		colorChooser = new JComboBox();
		colorChooser.addItem("RED");
		colorChooser.addItem("PINK");
		colorChooser.addItem("ORANGE");
		colorChooser.addItem("BLUE");
		colorChooser.addItem("BLACK");
		colorChooser.addItem("Random");
		colorChooser.setEditable(false);
		colorChooser.setSelectedItem("Random");
		add(new JLabel("  Color:"), SOUTH);
		add(colorChooser,SOUTH);
		addMouseListeners();
		addActionListeners();
	}
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	public void mouseClicked(MouseEvent e) {
		if (gobj != null) gobj.sendToFront();
		else newShape();
	}
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX()- last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}
	public void newShape() {
		if (squareButton.isSelected()) shape = GSquare(rgen.nextInt(20,40));
		if (triangleButton.isSelected()) shape = GTriangle(rgen.nextInt(25,40));
		if (starButton.isSelected()) shape = GStar(rgen.nextInt(20,50)); 
		if (heartButton.isSelected()) shape = GHeart(rgen.nextInt(10,30));
		if (randomButton.isSelected()) {
			int shapeNumber = rgen.nextInt(1,4);
			switch (shapeNumber) {
			case 1: shape = GHeart(rgen.nextInt(10,30));
			break;
			case 2: shape = GStar(rgen.nextInt(20,50));
			break;
			case 3: shape = GTriangle(rgen.nextInt(25,40));
			break;
			case 4: shape = GSquare(rgen.nextInt(20,40));
			default: 
			break;
			}
		}
		shape.setFilled(true);
		shape.setColor(getColor());
		add(shape, last.getX(), last.getY());
	}
	
	public Color getColor() {
		String name = (String) colorChooser.getSelectedItem();
		if (name.equals("RED")) return Color.RED;
		if (name.equals("PINK")) return Color.magenta;
		if (name.equals("ORANGE")) return Color.ORANGE;
		if (name.equals("BLUE")) return Color.cyan;
		if (name.equals("BLACK")) return Color.black;
		if (name.equals("Random")) return rgen.nextColor();
		return Color.white;
	}
	
	public GPolygon GStar(double size) {
	      double sinTheta = GMath.sinDegrees(18);
	      double b = 0.5 * sinTheta / (1.0 + sinTheta);
	      double edge = (0.5 - b) * size;
	      GPolygon star = new GPolygon();
	      star.addVertex(-size / 2, -b * size);
	      int angle = 0;
	      for (int i = 0; i < 5; i++) {
	         star.addPolarEdge(edge, angle);
	         star.addPolarEdge(edge, angle + 72);
	         angle -= 72;
	      }
	      return star;
	   }
	public GPolygon GHeart (int a) {
		double c = Math.sqrt(2 * a * a);
		GPolygon heart = new GPolygon();
		heart.addVertex(0,a);
		heart.addEdge(a,-a);
		heart.addArc(c,c,-45,180);
		heart.addArc(c,c,45,180);
		heart.addEdge(a,a);
		return heart;
		}
	
	public GPolygon GTriangle (int height) {
		GPolygon triangle = new GPolygon();
		triangle.addVertex(0, -height/2);
		triangle.addVertex(-height/2,height/2);
		triangle.addVertex(height/2,height/2);
		return triangle;
	}
	public GPolygon GSquare (int height) {
		GPolygon square = new GPolygon();
		square.addVertex(-height/2, -height/2);
		square.addVertex(height/2,-height/2);
		square.addVertex(height/2,height/2);
		square.addVertex(-height/2,height/2);
		return square;
	}
	private GObject gobj;
	private GPoint last;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private JCheckBox fillCheckbox;
	private JRadioButton squareButton;
	private JRadioButton triangleButton;
	private JRadioButton heartButton;
	private JRadioButton starButton;
	private JRadioButton randomButton;
	private JComboBox colorChooser;
	private GPolygon shape = null;
}