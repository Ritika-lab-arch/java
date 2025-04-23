public class Main {
    public static void main(String[] args) {
        // Creating a string
        String str1 = "Hello World";

        // Printing a string
        System.out.println(str1);

        // Concatenation
        String name = "Alice";
        String greeting = "Hello, " + name;
        System.out.println(greeting);

        // String length
        int length = str1.length();
        System.out.println("Length: " + length);

        // Accessing characters
        char firstChar = str1.charAt(0);
        System.out.println("A" + firstChar);

        // Comparing strings
        String str2 = "hello world";
        System.out.println(str1.equals(str2));             // false (case-sensitive)
        System.out.println(str1.equalsIgnoreCase(str2));   // true
}
}
