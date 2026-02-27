public class Main {
    public static void main(String[] args) {

        // UC1: Application Entry & Welcome Message
        System.out.println("Welcome to Palindrome Checker App");

        // UC2: Print a Hardcoded Palindrome Result
        String word = "MADAM";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        // UC3: Palindrome Check Using String Reverse
        String original = "level";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}