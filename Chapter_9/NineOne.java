import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-1
 * @date Oct. 24, 2018
 * @summary (The Rectangle class) Following the example of the Circle class in
 *          Section 9.2, design a class named Rectangle to represent a
 *          rectangle. The class contains:
 * 
 *          Two double data fields named width and height that specify the width
 *          and height of the rectangle. The default values are 1 for both width
 *          and height. A no-arg constructor that creates a default rectangle. A
 *          constructor that creates a rectangle with the specified width and
 *          height. A method named getArea() that returns the area of this
 *          rectangle. A method named getPerimeter() that returns the perimeter.
 *          Draw the UML diagram for the class and then implement the class.
 *          Write a test program that creates two Rectangle objects—one with
 *          width 4 and height 40 and the other with width 3.5 and height 35.9.
 *          Display the width, height, area, and perimeter of each rectangle in
 *          this order.
 **/
class NineOne {
	public static void main(String[] args) {
		System.out.println("Input Width: ");
		double widthInput = getInput();
		System.out.println("Input Height: ");
		double heightInput = getInput();
		// add to rectangle
	}

	/**
	 * This method calculates the area of the rectangle
	 * 
	 * @return Area is returned as a double
	 */
	public static double getArea() {
		double area = 0;
		double width = 1;
		double height = 1;
		area = width * height;
		return area;
	}

	/**
	 * This method calculates the perimeter
	 * 
	 * @return Perimeter is returned as a double
	 */
	public static double getPerimeter() {
		double perimeter = 0;
		double width = 1;
		double height = 1;
		perimeter = (width * 2) + (height * 2);
		return perimeter;
	}

	/**
	 * This class is the rectangle. It holds width and height data
	 *
	 */
	public class rectangle {
		double width = 1;
		double height = 1;
		double area = 0;
		double perimeter = 0;
	}

	/**
	 * This method gets input from the user
	 * 
	 * @return Input is returned as a double
	 */
	public static double getInput() {
		Scanner reader = new Scanner(System.in);
		double input = reader.nextDouble();
		reader.close();
		return input;
	}

	/**
	 * This is the no argument constructor
	 */
	public static void noArgConstructor() {

	}

	/**
	 * This is the ULM diagram
	 */
	public static void ulm() {

	}

	/**
	 * This method prints out the information about the rectangle
	 */
	public static void printer() {
		double width = 0; // from rectangle
		double height = 0;
		double area = getArea();
		double perimeter = getPerimeter();

		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}