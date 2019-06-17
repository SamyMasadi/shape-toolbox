// Project 1: Samy Masadi

/**
 * A rectangle has a length, width, area, and perimeter.
 * Not to be confused with Java Rectangle class.
 */
public class RectangleCalc
{
	private double length;
	private double width;
	
	/**
	 * Constructs a rectangle with given length and width.
	 * @param givenLength the given length
	 * @param givenWidth the given width
	 */
	public RectangleCalc(double givenLength, double givenWidth)
	{
		length = givenLength;
		width = givenWidth;
	}
	
	/**
	 * Calculates the area of the rectangle
	 * @return the area of the rectangle
	 */
	public double getArea()
	{
		return length * width;
	}
	
	/**
	 * Calculates the perimeter of the rectangle
	 * @return the perimeter of the rectangle
	 */
	public double getPerimeter()
	{
		return 2 * (length + width);
	}
	
	/**
	 * Draws the rectangle component
	 */
	public ShapeComponent drawRectangle()
	{
		ShapeComponent rectangleComponent = new ShapeComponent(length, width, 
				"rectangle");
		return rectangleComponent;
	}
}