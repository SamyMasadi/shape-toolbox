// Project 1: Samy Masadi

/**
 * A circle has a radius, area, and circumference.
 */
public class Circle
{
	private double radius;
	
	/**
	 * Constructs a circle with a given radius.
	 * @param givenRadius the given radius
	 */
	public Circle(double givenRadius)
	{
		radius = givenRadius;
	}
	
	/**
	 * Calculates the area of the circle
	 * @return the area of the circle
	 */
	public double getArea()
	{
		double area = Math.PI * Math.pow(radius, 2); 
		return area;
	}
	
	/**
	 * Calculates the circumference of the circle
	 * @return the circumference of the circle
	 */
	public double getCircumference()
	{
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	/**
	* Draws the circle component
	*/
	public ShapeComponent drawCircle()
	{
		ShapeComponent circleComponent = new ShapeComponent(radius*2, radius*2, 
				"circle");
		return circleComponent;
	}
}