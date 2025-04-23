import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- String Reverser ---");
        System.out.println("Enter a string to recerse : ");
        String userInput = sc.nextLine();

        // method 1 - using for loop with backward - less efficient
        String reverseStringConcat = "";
        for (int i = userInput.length() - 1; i >=0; i--) {
            reverseStringConcat += userInput.charAt(i);
        }
        System.out.println("Reversed (concatenation) : " + reverseStringConcat);

        // method 2 - using StringBuilder - more efficient
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        System.out.println("Reversed (StringBuilder) : " + sb.toString());

        // method 3 - using StringBuilder with manual append
        StringBuilder sbManual = new StringBuilder();
        for (int i = userInput.length() - 1; i >= 0; i--) {
            sbManual.append(userInput.charAt(i));
        }
        System.out.println("Reversed (Sb manual) : " + sbManual.toString());

        sc.close();
        
        System.out.println("--------------------------------------");
    }
}
