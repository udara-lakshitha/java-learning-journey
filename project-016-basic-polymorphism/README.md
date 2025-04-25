# Project 016: Basic Polymorphism

This project demonstrates polymorphism, a core Object-Oriented Programming principle, using the `Animal`, `Dog`, and `Cat` classes from the previous inheritance example.

## Core Concepts Learned

*   **Polymorphism ("Many Forms"):** Using a superclass reference (`Animal`) to refer to objects of its subclasses (`Dog`, `Cat`).
*   **Upcasting:** Implicitly casting a subclass reference to a superclass reference when assigning to an array or variable of the superclass type.
*   **Dynamic Method Dispatch (Runtime Polymorphism):** The process where the JVM determines at runtime which overridden method implementation to execute based on the actual object type, not the reference type. This is seen when calling `makeSound()` on elements of the `Animal` array.
*   Treating different objects uniformly through a common superclass interface (calling `makeSound()` on any `Animal` reference).
*   Limitations: Inability to directly call subclass-specific methods (e.g., `fetch()`, `scratch()`) using only the superclass reference without explicit casting.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-016-basic-polymorphism` directory.
4.  Compile all Java files (including the copied `Animal`, `Dog`, `Cat`):
    ```bash
    javac *.java
    ```
5.  Run the `PolymorphismDemo` class:
    ```bash
    java PolymorphismDemo
    ```
6.  Observe the output, especially how the call to `makeSound()` inside the loop produces different results ("Woof! Woof!" or "Meow!") depending on the actual type of object stored in the `pets` array element.

## Example Output Snippet
```
--- Polymorphism Demo ---
Creating a Dog object...
Animal constructor called for: Buddy
Dog constructor called.
Creating a Cat object...
Animal constructor called for: Whiskers
Cat constructor called.
Creating a Dog object...
Animal constructor called for: Max
Dog constructor called.
--- Iterating through the pets array ---
Processing pet #1:
Name: Buddy
Buddy barks: Woof! Woof!
Buddy is eating.
Processing pet #2:
Name: Whiskers
Whiskers meows: Meow!
Whiskers is eating.
Processing pet #3:
Name: Max
Max barks: Woof! Woof!
Max is eating.
--- Iterating using Enhanced For Loop ---
Processing: Buddy
Buddy barks: Woof! Woof!
Processing: Whiskers
Whiskers meows: Meow!
Processing: Max
Max barks: Woof! Woof!