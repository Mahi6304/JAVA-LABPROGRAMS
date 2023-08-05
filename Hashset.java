import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Apple"); // Adding a duplicate element

        // Print the set
        System.out.println("Set elements: " + set);

        // Check if an element exists in the set
        String element = "Banana";
        if (set.contains(element)) {
            System.out.println(element + " is present in the set.");
        } else {
            System.out.println(element + " is not present in the set.");
        }

        // Remove an element from the set
        String removeElement = "Orange";
        boolean removed = set.remove(removeElement);
        if (removed) {
            System.out.println(removeElement + " was removed from the set.");
        } else {
            System.out.println(removeElement + " is not present in the set.");
        }

        // Print the updated set
        System.out.println("Updated set elements: " + set);

        // Iterate over the set using enhanced for loop
        System.out.println("Iterating over the set using enhanced for loop:");
        for (String item : set) {
            System.out.println(item);
        }

        // Clear the set
        set.clear();
        System.out.println("Set cleared. Size: " + set.size());
    }
}
