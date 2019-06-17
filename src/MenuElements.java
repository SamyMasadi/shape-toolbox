// Project 1: Samy Masadi

import javax.swing.JFrame;

/**
 * Basic elements for the Shape Toolbox menu
 * that can print the main menu, print shape details, and display shapes.
 */
public class MenuElements 
{
	/**
	 * Constructs the MenuElements object
	 */
	public MenuElements()
	{}
	
	/**
	 * Prints the main menu for Shape Toolbox
	 */
	public void menuPrinter()
	{
		System.out.println("Option 1: Exit the program");
		System.out.println("Option 2: Shape = Square");
		System.out.println("Option 3: Shape = Rectangle");
		System.out.println("Option 4: Shape = Circle");
		System.out.println("Option 5: Shape = Triangle");
		System.out.println();
		System.out.print("Please enter a number: ");
	}
	
	/**
	 * Prints details for a given shape
	 * @param area the shape's area
	 * @param perimeter the shape's perimeter
	 * @param type perimeter or circumference
	 */
	public void shapeDetails(double area, double perimeter, String type)
	{
		System.out.printf("Area: %.2f", area);
		System.out.println();
		System.out.printf(type+": %.2f", perimeter);
		System.out.println();
	}
	
	/**
	 * Displays a shape in a frame
	 * @param length the shape's width
	 * @param width the shape's width
	 * @param name the frame's title
	 * @param shape the shape component
	 */
	public void displayShape(double length, double width, 
			String name, ShapeComponent shape)
	{
		JFrame frame = new JFrame();		
		frame.setSize(200+(int)(length), 200+(int)(width));
		frame.setTitle(name);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.add(shape);
		frame.setVisible(true);
		System.out.println();
	}
}