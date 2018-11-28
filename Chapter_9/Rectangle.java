
public class Rectangle {
	double height;
	double width;
	double area;
	double perimeter;

	Rectangle() {
		height = 1;
		
	}

	Rectangle(double newWidth, double newHeight) {
		height = newHeight;
		width = newWidth;
	}

	double getPerimeter() {
		return ((height * 2) + (width * 2));
	}

	double getArea() {
		return height * width;
	}

	void printer(Rectangle rectangle) {
		double width = rectangle.width;
		double height = rectangle.height;
		double area = rectangle.getArea();
		double perimeter = rectangle.getPerimeter();

		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}