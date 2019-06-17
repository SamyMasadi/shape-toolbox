// Project 1: Samy Masadi

/**
 * A rectangle has four equal sides, an area, and a perimeter.
 */
public class Square
{
	private double length;
		
	/**
	 * Constructs a square with given length of any side.
	 * @param givenLength the given length
	 */
	public Square(double givenLength)
	{
		length = givenLength;
	}
	
	/**
	 * Calculates the area of the square
	 * @return the area of the square
	 */
	public double getArea()
	{
		return length * length;
	}
	
	/**
	 * Calculates the perimeter of the square
	 * @return the perimeter of the square
	 */
	public double getPerimeter()
	{
		return 4 * length;
	}
	
	/**
	 * Draws the square component
	 */
	public ShapeComponent drawSquare()
	{
		ShapeComponent squareComponent = new ShapeComponent(length, length, "square");
		return squareComponent;
	}
}