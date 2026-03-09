import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {


    public static void main(String[] args) {

        // =========================
        // UC1: Application Entry & Welcome Message
        // =========================
        System.out.println("PALINDROME CHECKER APP");
        System.out.println("Version : 1.0");
        System.out.println("----------------------");

        // =========================
        // UC2: Hardcoded Palindrome Check (if-else)
        // =========================
        String wordUC2 = "madam";
        boolean isPalindromeUC2 = true;

        int i = 0;
        int j = wordUC2.length() - 1;

        while (i < j) {
            if (wordUC2.charAt(i) != wordUC2.charAt(j)) {
                isPalindromeUC2 = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindromeUC2) {
            System.out.println("UC2 Result: " + wordUC2 + " is a Palindrome");
        } else {
            System.out.println("UC2 Result: " + wordUC2 + " is NOT a Palindrome");
        }

        System.out.println("----------------------");

        // =========================
        // UC3: Palindrome Check Using String Reverse
        // =========================
        String wordUC3 = "level";
        String reversed = "";

        for (int k = wordUC3.length() - 1; k >= 0; k--) {
            reversed = reversed + wordUC3.charAt(k);
        }

        if (wordUC3.equals(reversed)) {
            System.out.println("UC3 Result: " + wordUC3 + " is a Palindrome");
        } else {
            System.out.println("UC3 Result: " + wordUC3 + " is NOT a Palindrome");
        }

        System.out.println("----------------------");

        // =========================
        // UC4: Character Array Based Palindrome Check
        // =========================
        String wordUC4 = "radar";

        char[] chars = wordUC4.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindromeUC4 = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindromeUC4 = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindromeUC4) {
            System.out.println("UC4 Result: " + wordUC4 + " is a Palindrome");
        } else {
            System.out.println("UC4 Result: " + wordUC4 + " is NOT a Palindrome");
        }
        String input5 = "noon";
        Stack<Character> stack5 = new Stack<>();

        for (char c : input5.toCharArray()) {
            stack5.push(c);
        }

        boolean isPalindrome5 = true;

        for (char c : input5.toCharArray()) {
            if (c != stack5.pop()) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("Input : " + input5);
        System.out.println("Is Palindrome? : " + isPalindrome5);
        // UC6: Queue + Stack Based Palindrome Check
        String input6 = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack6 = new Stack<>();

        for (char c : input6.toCharArray()) {
            queue.add(c);
            stack6.push(c);
        }

        boolean isPalindrome6 = true;

        while (!queue.isEmpty()) {
            if (queue.poll() != stack6.pop()) {
                isPalindrome6 = false;
                break;
            }
        }

        System.out.println("Input : " + input6);
        System.out.println("Is Palindrome? : " + isPalindrome6);
    }

}