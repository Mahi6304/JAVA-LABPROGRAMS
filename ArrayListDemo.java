import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get the size of the ArrayList
        int size = names.size();
        System.out.println("Size of ArrayList: " + size);

        // Access elements in the ArrayList
        String firstElement = names.get(0);
        System.out.println("First element: " + firstElement);

        // Update an element in the ArrayList
        names.set(1, "Eve");

        // Remove an element from the ArrayList
        names.remove(2);

        // Check if an element exists in the ArrayList
        boolean containsCharlie = names.contains("Charlie");
        System.out.println("Contains 'Charlie': " + containsCharlie);

        // Iterate over the elements in the ArrayList
        System.out.println("Elements in ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
