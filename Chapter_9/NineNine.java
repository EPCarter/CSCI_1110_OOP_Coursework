import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-9
 * @date Oct. 24, 2018
 * @summary (Geometry: n-sided regular polygon) In an n-sided regular polygon,
 *          all sides have the same length and all angles have the same degree
 *          (i.e., the polygon is both equilateral and equiangular). Design a
 *          class named RegularPolygon that contains:
 * 
 *          A private int data field named n that defines the number of sides in
 *          the polygon with default value 3.
 * 
 *          A private double data field named side that stores the length of the
 *          side with default value 1.
 * 
 *          A private double data field named x that defines the x-coordinate of
 *          the polygon’s center with default value 0.
 * 
 *          A private double data field named y that defines the y-coordinate of
 *          the polygon’s center with default value 0.
 * 
 *          A no-arg constructor that creates a regular polygon with default
 *          values.
 * 
 *          A constructor that creates a regular polygon with the specified
 *          number of sides and length of side, centered at (0, 0).
 * 
 *          A constructor that creates a regular polygon with the specified
 *          number of sides, length of side, and x- and y-coordinates.
 * 
 *          The accessor and mutator methods for all data fields.
 * 
 *          The method getPerimeter() that returns the perimeter of the polygon.
 * 
 *          The method getArea() that returns the area of the polygon.
 * 
 *          The formula for computing the area of a regular polygon is:
 * 
 *          Area = (n*s^2) /(4*tan(pi/n))
 * 
 *          Draw the UML diagram for the class and then implement the class.
 * 
 *          Write a test program that creates two RegularPolygon objects,
 *          created using the no-arg constructor, using RegularPolygon(6, 4),
 *          and using RegularPolygon(10, 4, 5.6, 7.8).
 * 
 *          For each object, display its perimeter and area.
 **/
class NineNine {
	public static void main(String[] args) {

	}

	public void RegularPolygon(int n, double s, double x, double y) {
		n = 3;
		s = 1;
		x = 0;
		y = 0;
	}

	public static void noArgConstructor() {

	}

	public static void argConstructor() {
		System.out.println("Sides: ");
		int n = (int) getInput();
		System.out.println("Length: ");
		double length = getInput();
	}

	public static void argConstructor2() {
		System.out.println("Sides: ");
		int sides = (int) getInput();
		System.out.println("Length: ");
		double length = getInput();
		System.out.println("X: ");
		double x = getInput();
		System.out.println("Y: ");
		double y = getInput();
	}

	public static double getInput() {
		Scanner reader = new Scanner(System.in);
		double input = reader.nextDouble();
		reader.close();
		return input;
	}

	public static double getPerimeter(int n, double s) {
		double perimeter = 0;
		return perimeter;
	}

	public static double getArea(int n, double s) {
		double area = 0;
		area = (n * (s * s)) / (4 * Math.tan(Math.PI / n));
		return area;
	}

	public static void printer() {
		double perimeter = 0;
		double area = 0;
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}

	public static void setN() {

	}

	public static void getN() {

	}

	public static void setS() {

	}

	public static void getS() {

	}

	public static void setX() {

	}

	public static void getX() {

	}

	public static void setY() {

	}

	public static void getY() {

	}

	public static void uml() {

	}
}

/*
 * The accessor and mutator methods for all data fields.
 * 
 * 
 * /
 */