package constructorOverloading;

public class Rectangle {
	
	// Properties of the Rectangle class
    private double length;
    private double width;

    // Default constructor with default values
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with given values
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to display the area of the rectangle
    public void displayArea() {
        System.out.println("Area of the rectangle: " + calculateArea());
    }

    // Main method to create objects of Rectangle class and display their areas
    public static void main(String[] args) {
        // Creating an object of Rectangle class using default constructor
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        defaultRectangle.displayArea();

        // Creating an object of Rectangle class using parameterized constructor
        Rectangle customRectangle = new Rectangle(5.0, 3.0);
        System.out.println("Custom Rectangle:");
        customRectangle.displayArea();
    }

}
