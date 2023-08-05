public class ConstructorOverloading {
    private int number;
    private String name;

    // Default constructor
    public ConstructorOverloading() {
        number = 0;
        name = "";
    }

    // Constructor with one parameter
    public ConstructorOverloading(int number) {
        this.number = number;
        name = "";
    }

    // Constructor with two parameters
    public ConstructorOverloading(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // Method to display the values
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(20, "John");

        // Display the values
        System.out.println("Object 1:");
        obj1.display();
        System.out.println();

        System.out.println("Object 2:");
        obj2.display();
        System.out.println();

        System.out.println("Object 3:");
        obj3.display();
    }
}
