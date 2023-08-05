public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenation: " + concat);

        // Length
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // Substring
        String substring = str2.substring(0, 3);
        System.out.println("Substring of str2: " + substring);

        // Uppercase and lowercase
        String uppercase = str1.toUpperCase();
        String lowercase = str2.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Comparison
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Comparison using equals: " + isEqual);
        System.out.println("Comparison using equalsIgnoreCase: " + isEqualIgnoreCase);

        // IndexOf
        int index = str1.indexOf('o');
        System.out.println("Index of 'o' in str1: " + index);

        // Replace
        String replaced = str1.replace('l', 'x');
        System.out.println("Replacement in str1: " + replaced);

        // Split
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        System.out.println("Splitting sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Trim
        String spacedString = "   Hello, World!    ";
        String trimmed = spacedString.trim();
        System.out.println("Trimmed string: " + trimmed);
    }
}
