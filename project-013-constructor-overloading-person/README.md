# Project 013: Constructor Overloading - Person Class

This project demonstrates constructor overloading in Java using a `Person` class. Constructor overloading allows a class to have multiple constructors with different parameter lists, providing flexibility in how objects are created.

## Core Concepts Learned

*   **Constructor Overloading:** Defining multiple constructors (e.g., `Person(String, int)`, `Person(String)`, `Person()`) within the same class, distinguished by their parameters.
*   **Constructor Delegation:** Using `this(...)` as the first statement within a constructor to call another constructor in the same class, promoting code reuse and reducing redundancy.
*   Initializing objects with varying levels of detail.
*   Providing default values when parameters are omitted.
*   Reinforcement of classes, objects, private fields, public methods (constructors, getters), and `toString()`.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-013-constructor-overloading-person` directory.
4.  Compile both Java files:
    ```bash
    javac Person.java PersonDemo.java
    # Or: javac *.java
    ```
5.  Run the `PersonDemo` class:
    ```bash
    java PersonDemo
    ```
6.  Observe the output, paying attention to the constructor call sequence indicated by the print statements within the constructors and the final state of the created `Person` objects.

## Example Output Snippet
```
--- Person Class Demo with Constructor Overloading ---
Creating person1 (Name and Age):
Person(String, int) constructor called.
Creating person2 (Name only):
Person(String, int) constructor called.
Person(String) constructor finished.
Creating person3 (No arguments):
Person(String, int) constructor called.
Person(String) constructor finished.
Person() constructor finished.
Creating person4 (Invalid Age):
Person(String, int) constructor called.
Warning: Age cannot be negative. Setting to 0 for Charlie
Creating person5 (Empty Name):
Person(String, int) constructor called.
Warning: Name cannot be empty. Setting to 'Unknown'.
--- Created Person Objects ---
Person[Name=Alice, Age=30]
Person[Name=Bob, Age=0]
Person[Name=Default Person, Age=0]
Person[Name=Charlie, Age=0]
Person[Name=Unknown, Age=25]
Accessing data for Alice:
Age: 30