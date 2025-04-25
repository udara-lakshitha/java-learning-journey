# Project 015: Simple Inheritance - Animal -> Dog/Cat

This project introduces basic inheritance, a core concept in Object-Oriented Programming (OOP). It demonstrates creating a superclass (`Animal`) and subclasses (`Dog`, `Cat`) that inherit and override behaviors.

## Core Concepts Learned

*   **Inheritance:** Creating new classes (subclasses) based on existing ones (superclasses).
*   **`extends` Keyword:** Establishing the inheritance relationship.
*   **Superclass & Subclass:** Understanding the parent-child class structure.
*   **Code Reuse:** Subclasses inheriting fields and methods from the superclass (e.g., `name`, `age`, `eat()`).
*   **Method Overriding:** Providing a specific implementation in a subclass for a method defined in the superclass (e.g., `makeSound()`).
*   **`@Override` Annotation:** Ensuring correct method overriding and improving code clarity.
*   **`super()` Constructor Call:** Calling the superclass constructor from the subclass constructor (essential when the superclass lacks a no-arg constructor).
*   **"IS-A" Relationship:** A `Dog` IS-A `Animal`, a `Cat` IS-A `Animal`.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-015-simple-inheritance-animal` directory.
4.  Compile all Java files:
    ```bash
    javac Animal.java Dog.java Cat.java InheritanceDemo.java
    # Or: javac *.java
    ```
5.  Run the `InheritanceDemo` class:
    ```bash
    java InheritanceDemo
    ```
6.  Observe the output showing constructor calls, inherited method usage, overridden method behavior, and subclass-specific method calls.

## Example Output Snippet
```
--- Inheritance Demo ---
Creating a Dog object...
Animal constructor called for: Buddy
Dog constructor called.
Creating a Cat object...
Animal constructor called for: Whiskers
Cat constructor called.
--- Demonstrating Dog ---
Dog[Animal[Name=Buddy, Age=3], Breed=Golden Retriever]
Name: Buddy
Age: 3
Breed: Golden Retriever
Buddy is eating.
Buddy barks: Woof! Woof!
Buddy is fetching the ball.
--- Demonstrating Cat ---
Cat[Animal[Name=Whiskers, Age=2]]
Name: Whiskers
Age: 2
Whiskers is eating.
Whiskers meows: Meow!
Whiskers is scratching the post.