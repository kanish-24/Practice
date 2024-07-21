package inheritance;

public class Vehicle {
	
	// Properties of the Vehicle class
    private String make;
    private int year;

    // Constructor to initialize the properties
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Method to display the properties of the vehicle
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
	
}


