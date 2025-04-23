import java.util.Scanner;

public class PalindromeChecker  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Palindrome Checker ---");
        System.out.println("Enter a string : ");
        String userInput = sc.nextLine();

        // preprocessing - make all to lowercase and remove non-alphanumeric characters
        String processedString = userInput.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        boolean isPalindrome = false;

        if (processedString.isEmpty()) {
            isPalindrome = true;
        } else {
            // method 1 - using StringBuilder
            StringBuilder sb = new StringBuilder(processedString);
            isPalindrome = processedString.equals(sb.reverse().toString());

            // method 2 - two pointers (uncomment to use this)
            // int start = 0;
            // int end = processedString.length() - 1;
            // isPalindrome = true;
            // while (start < end) {
            //     if (processedString.charAt(start) != processedString.charAt(end)) {
            //         isPalindrome = false;
            //         break;
            //     }
            //     start++;
            //     end--;
            // }

            if (isPalindrome) {
                System.out.println("Result : It is a palindrome");
            } else {
                System.out.println("Result : It is not a palindrome");
            }
        }
        sc.close();
        System.out.println("---------------------------");
    }
}
