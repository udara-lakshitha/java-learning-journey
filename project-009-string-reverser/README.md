# Project 009: String Reverser

This project demonstrates how to reverse a string entered by the user using Java.

## Core Concepts Learned

*   Reading `String` input using `Scanner.nextLine()`.
*   `String` methods: `length()`, `charAt()`.
*   Iterating through a `String` using a `for` loop (backwards).
*   String immutability.
*   String concatenation (`+`) and its potential inefficiency in loops.
*   Using the mutable `StringBuilder` class for efficient string manipulation.
*   `StringBuilder` methods: `append()`, `reverse()`, `toString()`.

## How to Run

1.  Make sure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-009-string-reverser` directory.
4.  Compile the Java code:
    ```bash
    javac StringReverser.java
    ```
5.  Run the compiled code:
    ```bash
    java StringReverser
    ```
6.  Follow the prompt to enter a string. The program will output the reversed string using different methods.

## Example Usage

--- String Reverser ---
Enter a string to reverse: Hello World
Reversed (Concatenation): dlroW olleH
Reversed (StringBuilder): dlroW olleH
Reversed (SB Manual): dlroW olleH