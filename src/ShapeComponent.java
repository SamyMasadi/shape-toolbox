// Project 1: Samy Masadi

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * A component of a given shape type for drawing in a frame.
 */
public class ShapeComponent extends JComponent 
{
	private double length; // also used for triangle base and circle diameter
	private double width; // also used for triangle height and circle diameter
	private double x3; // Used for drawing a triangle
	private int origin; // starting x,y anchor point value for drawing shapes
	private String shape;
	
	/**
	 * Constructs a shape component
	 * @param givenLength the given length
	 * @param givenWidth the given width
	 * @param givenShape the given shape type
	 */
	public ShapeComponent(double givenLength, double givenWidth, String givenShape)
	{
		length = givenLength;
		width = givenWidth;
		shape = givenShape;
		origin = 80;
	}
	
	/**
	 * Constructs a triangle shape component
	 * @param givenBase the given base
	 * @param givenHeight the given height
	 * @param givenSide2 the given second side
	 */
	public ShapeComponent(double givenBase, double givenHeight, double givenX3)
	{
		length = givenBase;
		width = givenHeight;
		x3 = givenX3;
		shape = "triangle";
		origin = 80;
	}
	
	/**
	 * Draws a shape: square, rectangle, circle, or triangle
	 * @param g the graphics context
	 */
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		switch(shape)
		{
		case "square": // Construct a square with a given side length
			Rectangle.Double square = new Rectangle.Double(origin, origin, 
					length, length);
			g2.draw(square);
			g2.drawString("Square", origin, origin-30);
			break;
		case "rectangle": // Construct a rectangle/square with a given length and width
			Rectangle.Double rectangle = new Rectangle.Double(origin, origin, 
					length, width);
			g2.draw(rectangle);
			g2.drawString("Rectangle", origin, origin-30);
			break;
		case "circle": 	// Construct a circle with the given radius
			Ellipse2D.Double circle = new Ellipse2D.Double(origin, origin, 
					length, width);
			g2.draw(circle);
			g2.drawString("Circle", origin, origin-30);
			break;
		case "triangle": // Construct a triangle with given base, height, x3	
			Point2D.Double P1 = new Point2D.Double(origin, origin);
			Point2D.Double P2 = new Point2D.Double(length+origin, origin);
			Point2D.Double P3 = new Point2D.Double(x3, width+origin);
			
			Line2D.Double tBase = new Line2D.Double(P1, P2);
			Line2D.Double tSide2 = new Line2D.Double(P2, P3);
			Line2D.Double tSide3 = new Line2D.Double(P1, P3);
			
			g2.draw(tBase);
			g2.draw(tSide2);
			g2.draw(tSide3);
			
			g2.drawString("Triangle", origin, origin-30);
			break;
		}
	}
}