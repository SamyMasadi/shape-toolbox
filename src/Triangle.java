// Project 1: Samy Masadi

/**
 * A triangle has three sides, base, height, area, and perimeter.
 */
public class Triangle
{
	private double base;
	private double height;
	private double side2;
	private double side3;
	
	/**
	 * Constructs a triangle with given base (side1), height, and two remaining sides.
	 * @param givenBase the given base (first side)
	 * @param givenHeight the given height
	 * @param givenSide2 the given second side
	 * @param givenSide3 the given third side
	 */
	public Triangle(double givenBase, double givenHeight, 
			double givenSide2, double givenSide3)
	{
		base = givenBase;
		height = givenHeight;
		side2 = givenSide2;
		side3 = givenSide3;
	}
	
	/**
	 * Calculates the area of the triangle
	 * @return the area of the triangle
	 */
	public double getArea()
	{
		return 0.5 * base * height;
	}
	
	/**
	 * Calculates the perimeter of the triangle
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter()
	{
		return base + side2 + side3;
	}
	
	/**
	 * Calculates the X-value for the third triangle point
	 * @return the X-value
	 */
	private double getX3()
	{
		/* Calculate possible X-values for third point using distance formula
		 * with known base, height, and side lengths. Due to positive and negative 
		 * square roots, there are two possible Xs for each side. A match must be found
		 * to connect the sides at the same point. Compare Xs derived using Side2 with
		 * Xs derived using Side3 and find a match.*/
		double x3PosA = (base + 80) 
				+ Math.sqrt(Math.pow(side2, 2) - Math.pow(height, 2));
		double x3NegA = (base + 80) 
				- Math.sqrt(Math.pow(side2, 2) - Math.pow(height, 2));
		double x3PosB = (80) 
				+ Math.sqrt(Math.pow(side3, 2) - Math.pow(height, 2));
		double x3NegB = (80) 
				- Math.sqrt(Math.pow(side3, 2) - Math.pow(height, 2));
		
		/* Use Math.round to account for potential false mismatch due to
		 * rounding error in decimals.*/
		if(Math.round(x3NegA)==Math.round(x3PosB))
		{
			return x3NegA;
		}
		else if(Math.round(x3NegA)==Math.round(x3NegB))
		{
			return x3NegA;
		}
		else // If first possible X doesn't match, assume the other X matches.
		{
			return x3PosA;
		}
	}
	
	/**
	 * Draws the triangle component
	 */
	public ShapeComponent drawTriangle()
	{
		ShapeComponent triangleComponent = new ShapeComponent(base, height, 
				this.getX3());
		return triangleComponent;
	}
}