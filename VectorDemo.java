import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        // Adding elements to the Vector
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements in the Vector
        System.out.println("Elements in the Vector:");
        for (String name : names) {
            System.out.println(name);
        }

        // Checking if an element exists in the Vector
        boolean containsBob = names.contains("Bob");
        System.out.println("Contains 'Bob': " + containsBob);

        // Removing an element from the Vector
        names.remove("Charlie");

        // Getting the size of the Vector
        int size = names.size();
        System.out.println("Size of the Vector: " + size);
    }
}
