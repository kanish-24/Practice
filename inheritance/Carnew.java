package inheritance;

public class Carnew extends Vehicle{
	
	// Additional property of the Car class
    private String model;

    // Constructor to initialize the properties
    public Carnew(String make, int year, String model) {
        // Call the constructor of the base class
        super(make, year);
        this.model = model;
    }

    // Method to display the properties of the car
    @Override
    public void display() {
        // Call the display method of the base class
        super.display();
        System.out.println("Model: " + model);
    }

    // Main method to create an object of Car class and display its properties
    public static void main(String[] args) {
        // Creating an object of the Car class
        Carnew car = new Carnew("Toyota", 2024, "Fortuner");

        // Displaying the properties of the car
        car.display();
    }

}
