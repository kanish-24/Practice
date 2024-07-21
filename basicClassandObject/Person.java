package basicClassandObject;

public class Person {
	
	// Properties of the Person class
    private String name;
    private int age;

    // Constructor to initialize the properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the properties of the person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to create an object of Person class and display its properties
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("Ram Singh", 25);

        // Displaying the properties of the person
        person.display();
    }
}
	
	
