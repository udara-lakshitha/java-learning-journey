# Project 010: Palindrome Checker

This program checks if a string entered by the user is a palindrome. A palindrome reads the same forwards and backwards, ignoring case and non-alphanumeric characters.

## Core Concepts Learned

*   String input (`Scanner.nextLine()`).
*   String manipulation: `toLowerCase()`, `replaceAll()` with regular expressions.
*   Using `StringBuilder.reverse()` for efficient reversal.
*   String comparison using `equals()`.
*   Conditional logic (`if-else`) for determining the result.
*   Handling edge cases (e.g., empty string after processing).
*   (Alternative) Two-pointer technique for comparison (commented out in code).

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-010-palindrome-checker` directory.
4.  Compile the Java code:
    ```bash
    javac PalindromeChecker.java
    ```
5.  Run the compiled code:
    ```bash
    java PalindromeChecker
    ```
6.  Enter a string when prompted. The program will indicate if it's a palindrome.

## Example Usage
```
--- Palindrome Checker ---
Enter a string: A man, a plan, a canal: Panama
Original string: "A man, a plan, a canal: Panama"
Result: It IS a palindrome.
```
--- Palindrome Checker ---
Enter a string: Hello World
Original string: "Hello World"
Result: It is NOT a palindrome.