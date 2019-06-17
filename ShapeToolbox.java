// Project 1: Samy Masadi

/*
 * This is a shape toolbox that will calculate the area and circumference/perimeter
 * for a variety of shapes: square, rectangle, circle, and triangle.
 * The program will prompt the user for their desired shape.
 * For each shape, the program will prompt the user for necessary parameters,
 * such as length and width.
 * Finally, the program will print the calculated area and circumference/perimeter,
 * and draws the shape in a frame.
 */

import java.util.Scanner;

public class ShapeToolbox 
{
	public static void main(String[] args) 
	{
		String choice = "0"; // Sentinel variable for while loop
		Scanner in = new Scanner(System.in);
		MenuElements menu = new MenuElements();
		
		System.out.println("Welcome to the Shape Toolbox");
		
		while(choice.equals("1") == false)
		{		
			menu.menuPrinter(); // Prints the menu with every loop
			choice = in.next();
			System.out.println();
			
			switch(choice)
			{
			case "1": // Exits the program.
					System.out.println("Thank you for using the Shape Toolbox");
					in.close();
					break;
			case "2": // Square option
					System.out.print("Please enter the length of any side: ");
					double sLength = in.nextDouble();
					Square userSquare = new Square(sLength);
					
					System.out.println("Square");
					System.out.println("Side length: "+sLength);
					menu.shapeDetails(userSquare.getArea(), 
							userSquare.getPerimeter(), "Perimeter");
					menu.displayShape(sLength, sLength, "Square", 
							userSquare.drawSquare());
					break;			
			case "3": // Rectangle option
					System.out.print("Please enter the length: ");
					double rLength = in.nextDouble();
					System.out.println();
					System.out.print("Please enter the width: ");
					double rWidth = in.nextDouble();
					System.out.println();
					RectangleCalc userRectangle = new RectangleCalc(rLength, rWidth);
					
					System.out.println("Rectangle");
					System.out.println("Length: "+ rLength);
					System.out.println("Width: " +rWidth);
					menu.shapeDetails(userRectangle.getArea(), 
							userRectangle.getPerimeter(), "Perimeter");
					menu.displayShape(rLength, rWidth, 
							"Rectangle", userRectangle.drawRectangle());					
					break;			
			case "4": // Circle option
					System.out.print("Please enter the radius: ");
					double cRadius = in.nextDouble();
					Circle userCircle = new Circle(cRadius);
					
					System.out.println("Circle");
					System.out.println("Radius: "+cRadius);
					menu.shapeDetails(userCircle.getArea(), 
							userCircle.getCircumference(), "Circumference");
					menu.displayShape(cRadius*2, cRadius*2, 
							"Circle", userCircle.drawCircle());
					break;			
			case "5": // Triangle option
					System.out.print("Please enter the base (first side) length: ");
					double tBase = in.nextDouble();
					System.out.println();
					System.out.print("Please enter the height: ");
					double tHeight = in.nextDouble();
					System.out.println();
					System.out.print("Please enter the second side length: ");
					double tSide2 = in.nextDouble();
					System.out.println();
					System.out.print("Please enter the third side length: ");
					double tSide3 = in.nextDouble();
					Triangle userTriangle = new Triangle(tBase, tHeight, 
							tSide2, tSide3);
					
					System.out.println("Triangle");
					System.out.println("Base (First side): "+tBase);
					System.out.println("Height: "+tHeight);
					System.out.println("Second side: "+tSide2);
					System.out.println("Third side: "+tSide3);
					menu.shapeDetails(userTriangle.getArea(), 
							userTriangle.getPerimeter(), "Perimeter");
					menu.displayShape(tBase, tHeight, "Triangle", 
							userTriangle.drawTriangle());					
					break;
			default:// For unexpected input
					System.out.println("Error: Enter a number from 1-5");
					System.out.println();
					break;
			}
		}
	}
}